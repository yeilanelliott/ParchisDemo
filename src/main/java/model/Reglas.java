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

    private final int totalCasillas = 68;
    // 0 = rojo - 1 = amarillo - 2 = azul - 3 = verde
    private final int[] salida = new int[]{38, 4, 21, 55};
    private final int[] entrada = new int[]{33, 67, 16, 50};

    public int getTotalCasillas() {
        return totalCasillas;
    }

    public boolean salir(int dado) {
        return dado == 5;
    }

    // 0 = rojo - 1 = amarillo - 2 = azul - 3 = verde
    public int salidaId(int colorId) {
        if (colorId < 0) {
            colorId = 0;
        }
        if (colorId > 3) {
            colorId = 3;
        }
        return salida[colorId];
    }

    // ¿Está exactamente en la casilla de entrada WIN?
    public boolean entradaWin(int colorId, int indiceRecorrido) {
        if (colorId < 0 || colorId > 3) {
            return false;
        }
        return indiceRecorrido == entrada[colorId];
    }

    // Avance circular (versión corta con módulo)
    public int avanzar(int indice, int valorDado) {
        int r = (indice + valorDado) % totalCasillas;
        if (r < 0) {
            r += totalCasillas;
        }
        return r;
    }

    // ¿Durante el avance pisa la casilla de entrada WIN?
    public boolean posicionFichaEntrada(int colorId, int indice, int valorDado) {
        if (valorDado <= 0) {
            return false;
        }
        if (colorId < 0 || colorId > 3) {
            return false;
        }

        int objetivo = entrada[colorId];
        for (int i = 1; i <= valorDado; i++) {
            indice++;
            if (indice == totalCasillas) {
                indice = 0;
            }
            if (indice == objetivo) {
                return true;
            }
        }
        return false;
    }

    //Fase 3:
    private int[] seguras = new int[]{4,11,16,21,28,33,38,45,50,55,62,67};

    public boolean esCasillaSegura(int indice) {
        for (int i = 0; i < seguras.length; i++) {
            if (seguras[i] == indice) {
                return true;
            }
        }
        return false;
    }
}
