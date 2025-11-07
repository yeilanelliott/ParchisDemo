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

    private String colorNombre;//colorId
    private boolean posicionInicial, caminoWin;
    private int color,pasoWin,indice;

    public Ficha(int pColor) {
        //Atributo de la clase ficha = variable del constructor
        color = pColor;//colorId
        colorNombre = new Colores().nombre(pColor);
        indice = -1; // -1 = en casa
        posicionInicial = true; //en casa
        caminoWin = false; //Estaba true, cambiar a false
        pasoWin = 0;

    }
    //GET
    public String getColorNombre() {
        return colorNombre;
    }

    public boolean isPosicionInicial() {
        return posicionInicial;
    }

    public boolean isCaminoWin() {
        return caminoWin;
    }

    public int getColor() {
        return color;
    }

    public int getPasoWin() {
        return pasoWin;
    }  
    
    public int getIndice() {    
        return indice;
    }

    //SET

    public void setColorNombre(String colorNombre) {
        this.colorNombre = colorNombre;
    }

    public void setPosicionInicial(boolean posicionInicial) {
        this.posicionInicial = posicionInicial; //EnCasa
    }

    public void setCaminoWin(boolean caminoWin) {
        this.caminoWin = caminoWin;//EnCaminoWin
    }

//    public void setColor(int color) {
//        this.color = color;
//    }

    public void setPasoWin(int pasoWin) {
        this.pasoWin = pasoWin;//Le podemos cambiar el nombre a la variable del parametro del set
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
  

    public void reset() {
        indice = -1;
        pasoWin = 0;
        posicionInicial = true;//EnCasa
        caminoWin = false;//
    }

}
