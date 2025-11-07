/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maria
 */
public class Reglas {

    private int totalCasillas = 68;
    // 0 = rojo - 1 = amarillo - 2 = azul - 3 = verde
    private int[] salida = new int[]{38, 4, 21, 55};
    // Índice de entrada al camino WIN por color (según tu tablero)
    private int[] entrada = new int[]{33, 67, 16, 50};

    public int getTotalCasillas() {
        return totalCasillas;
    }

    public boolean salir(int dado) {
        return dado == 5;
    }

    // 0 = rojo - 1 = amarillo - 2 = azul - 3 = verde
    public int salidaId(int colorId) {
        return salida[colorId];
    }

    // ¿Está exactamente en la casilla de entrada WIN?
    public boolean entradaWin(int colorId, int indiceRecorrido) {
        return indiceRecorrido == entrada[colorId];
    }

    // Avance circular paso a paso (tu versión está correcta)
    public int avanzar(int indice, int valorDado) {
        for (int i = 0; i < valorDado; i++) {
            indice++;
            if (indice == totalCasillas) {
                indice = 0; // volver al inicio del recorrido
            }
        }
        return indice;
    }

    // ¿Durante el avance con este dado pisa la casilla de entrada WIN de su color?
    public boolean posicionFichaEntrada(int colorId, int indice, int valorDado) {
        // Seguridad básica
        if (valorDado <= 0) {
            return false;
        }
        if (colorId < 0 || colorId >= entrada.length) {
            return false;
        }

        int objetivo = entrada[colorId];

        for (int i = 1; i <= valorDado; i++) {
            indice++;
            if (indice >= totalCasillas) {
                indice = 0; // envolver
            }
            if (indice == objetivo) {
                return true; // en este turno entra al camino WIN
            }
        }
        return false;
    }

} // Fin de la clase
