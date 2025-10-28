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

    private String colorNombre;
    private boolean posicionInicial, caminoWin;
    private int color,pasoWin,totalSalida,salida,indice;

    public Ficha(int pColor) {
        //Atributo de la clase ficha = variable del constructor
        color = pColor;
        colorNombre = new Colores().nombre(pColor);
        salida = salida;
        totalSalida = totalSalida;
        indice = -1; // -1 = en casa
        posicionInicial = true;
        caminoWin = true;
        pasoWin = 0;

    }

    // === getters/Setters ===
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getColorNombre() {
        return colorNombre;
    }

    public void setColorNombre(String colorNombre) {
        this.colorNombre = colorNombre;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getTotalSalida() {
        return totalSalida;
    }

    public void setTotalSalida(int totalSalida) {
        this.totalSalida = totalSalida;
    }

    public boolean isPosicionInicial() {
        return posicionInicial;
    }

    public void setPosicionInicial(boolean posicionInicial) {
        this.posicionInicial = posicionInicial;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public boolean isCaminoWin() {
        return caminoWin;
    }

    public void setCaminoWin(boolean caminoWin) {
        this.caminoWin = caminoWin;
    }

    public int getPasoWin() {
        return pasoWin;
    }

    public void setPasoWin(int pasoWin) {
        this.pasoWin = pasoWin;
    }

    public void reset() {
        indice = -1;
        pasoWin = 0;
        posicionInicial = true;
        caminoWin = true;
    }

}
