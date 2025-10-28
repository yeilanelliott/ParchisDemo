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
 * @author maria
 */
public class ControladorJuego implements ActionListener {

    //Se llama las clases GUiJuego y sus paneles (Control y Tablero)
    //Atributos tipo Objeto
    private GUIJuego gui;
    private PanelControl panelControl;
    private PanelTablero panelTablero;

    //Clases de coordenadas, paquete modelo
    private TableroCoordenadas tablero;
    private CoordenadasHome home;

    //Atributo tipo objeto (clase ficha)
    private Ficha jugador;
    private Ficha oponente;

    //Estos atributos sirven para identificar el color de la ficha del jugador y el oponente
    private int colorJugadorId;
    private int colorOponenteId;

    //inicializando las clases Random,Dado y Colores
    private Random random = new Random();
    private Dado dado = new Dado(random, 0);
    private Colores colores = new Colores();

    public ControladorJuego(PanelControl panelControl, PanelTablero panelTablero, int pColorJugadorId) {
        this.panelControl = panelControl;
        this.panelTablero = panelTablero;
        this.colorJugadorId = colorJugadorId;

        tablero = new TableroCoordenadas();
        home = new CoordenadasHome();

        //Atributo = la variable del constructor
        //Identifica los id r=0,Amarillo=1,A=2,V=3
        colorJugadorId = pColorJugadorId;
        if (colorJugadorId < 0) {
            colorJugadorId = 0;
        }
        if (colorJugadorId > 3) {
            colorJugadorId = 3;
        }
        //Parejas: (Rojo y Amarillo) (Azul y Verde)
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
        
        //Listeners
        panelControl.getBtnDado().addActionListener(this);
        panelControl.getBtnReinicio().addActionListener(this);
        
        //Ubircar la ficha en home
        Coordenadas cJugador = home.getHome(colorJugadorId);
        Coordenadas cOponente = home.getHome(colorJugadorId);
        panelTablero.moverFicha(colorJugadorId,cJugador.getX(),cJugador.getY());
        panelTablero.moverFicha(colorOponenteId,cOponente.getX(),cOponente.getY());
        
        panelControl.setTextoTurno("Turno :"+ new Colores().nombre(colorJugadorId));
        panelControl.setNumeroDado(0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
