/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import model.*;
import view.*;

/**
 *
 * @author ellio
 */

public class ControladorJuego implements ActionListener {

    //Atributos de tipo clase 
    private GUIJuego gui;
    private PanelControl panelControl;
    private PanelTablero panelTablero;

    //Clases de coordenadas
    private TableroCoordenadas tablero;
    private CoordenadasHome home;

    private Reglas reglas;

    //Atributos tipo objeto (clase ficha)
    private Ficha jugador;
    private Ficha oponente;

    //Sirven para identificar el color de la ficha del jugador y el oponente
    private int colorJugadorId;
    private int colorOponenteId;
    //este atributo nos ayuda a identificar el turno del jugador 
    private boolean turnoJugador = true;

    //Inicializacion de las clases random, dado y colores 
    private Random random = new Random();
    private Dado dado = new Dado(random, 0);
    private Colores colores = new Colores();

    public ControladorJuego(PanelControl panelControl, PanelTablero panelTablero, int pColorJugadorId) {
        //El panel viene del atributo y el panel control viene de los parametros
        this.panelControl = panelControl;
        this.panelTablero = panelTablero;
        this.colorJugadorId = colorJugadorId;

        tablero = new TableroCoordenadas();
        home = new CoordenadasHome();

        colorJugadorId = pColorJugadorId;
        if (colorJugadorId < 0) {
            colorJugadorId = 0;
        }
        if (colorJugadorId > 3) {
            colorJugadorId = 3;
        }

        //Parejas : (ROJO Y AMARILLO) (AZUL Y VERDE) 
        if (colorJugadorId == 0) {
            colorOponenteId = 1;
        } else if (colorJugadorId == 1) {
            colorOponenteId = 0;
        } else if (colorJugadorId == 2) {
            colorOponenteId = 3;
        } else if (colorJugadorId == 3) {
            colorOponenteId = 2;
        }

        jugador = new Ficha(colorJugadorId);
        oponente = new Ficha(colorOponenteId);

        //Lisetenner
        panelControl.getBtnDado().addActionListener(this);
        panelControl.getBtnReinicio().addActionListener(this);

        //Ubicar la ficha en home
        Coordenadas cJugador = home.getHome(colorJugadorId);
        Coordenadas cOponente = home.getHome(colorJugadorId);
        panelTablero.moverFicha(colorJugadorId, cJugador.getX(), cJugador.getY());
        panelTablero.moverFicha(colorJugadorId, cOponente.getX(), cOponente.getY());
        //Llamamos al metodo set del texto o label de turno disponble en panel control
        panelControl.setTextoTurno("Turno : " + new Colores().nombre(colorJugadorId));
        panelControl.setNumeroDado(0);
    }//fin del constructor
    //Metodo para actualizar el turno 

    public void actualizarTurno() {
        //Se crea esta variable para actulizar la informacion del turno segun el color
        String nombreTurno;
        //metodo para actulizar el turno del jugador por medio de los set de colores y las variables del jugaro y el oponente
        if (turnoJugador) {
            nombreTurno = colores.nombre(colorJugadorId);
        } else {
            nombreTurno = colores.nombre(colorOponenteId);
        }
        panelControl.setTextoTurno(nombreTurno);
    }//fin del metodo

    public void actualizarHomeGraficos() {
        Coordenadas cJugador = home.getHome(colorJugadorId);
        Coordenadas cOponente = home.getHome(colorJugadorId);
        panelTablero.moverFicha(colorJugadorId, cJugador.getX(), cJugador.getY());
        panelTablero.moverFicha(colorJugadorId, cOponente.getX(), cOponente.getY());
    }//fin del metodo 

    public void Jugar() {
        //variable que viene de la clase dado para llamar el metodo
        int informacionDado = dado.dadosAleatorios();
        //usamos el set del numero que viene del panelControl
        panelControl.setNumeroDado(informacionDado);
        //Es un variable tipo objeto
        Ficha actual;
        int colorId;

        if (turnoJugador) {
            actual = jugador;
            colorId = colorJugadorId;
        } else {
            actual = oponente;
            colorId = colorOponenteId;
        }

        if (actual.isPosicionInicial()) {
            if (reglas.salir(informacionDado)) {
                //actual es la clase ficha. Los metodos que aplicamos son:
                //indice, setPosicionIncial,cominoWin,pasoWin.
                int exit = reglas.salidaId(colorId);
                actual.setIndice(exit);
                actual.setPosicionInicial(false);
                actual.setCaminoWin(false);
                actual.setPasoWin(0);
                pintarRecorrido(actual, colorId);
            } else {
                //Metodo que existe en esta clase (ControladorJuego)
                actualizarTurno();
                return;
            }}else if (!actual.isCaminoWin()) {
                        //Cruza la entrada a camino a win?
                        int d = actual.getIndice();
                        if (reglas.entradaWin(colorId, d)) {
                            
                        }
                    }//cierra el if
        }//metodo jugar

    public void pintarRecorrido(Ficha ficha, int colorId) {
        Coordenadas c = tablero.getPosicion(ficha.getIndice());
        panelTablero.moverFicha(colorId, c.getX(), c.getY());
    }

    private void pintarCaminoWin(Ficha ficha, int colorId, int steps) {
        Coordenadas c = tablero.getCaminoWin(colorId, steps);
        panelTablero.moverFicha(colorId, c.getX(), c.getY());
    }

    public void reiniciar() {
        jugador.reset();
        oponente.reset();
        panelControl.setNumeroDado(0);
        actualizarHomeGraficos();
        actualizarTurno();
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }//fin del metodo 

}//fin de  la clase 
