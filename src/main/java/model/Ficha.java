/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ellio
 */
public class Ficha {

    private String color;
    private int salida;
    private int totalSalida;              // lo mantengo por compatibilidad
    private boolean posicionInicial = true;
    private int indice = -1;             // -1 = en casa

    public Ficha(String color, int salida, int totalSalida) {
        this.color = color;
        this.salida = salida;
        this.totalSalida = totalSalida;
    }

    // === getters/estado ===
    public String getColor() {
        return color;
    }

    public boolean posicionInical() {
        return posicionInicial;
    }

    public boolean estaEnCasa() {
        return posicionInicial;
    }

    public int getIndice() {
        return indice;
    }

}
