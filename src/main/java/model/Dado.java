/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author ellio
 */
public class Dado {
    //Atributos 
    private Random random;
    
    //Constructor
    public Dado() {
        this.random = new Random();
    }
    
    //Metodos
    public int dadosAleatorios(){
        return random.nextInt(6)+1; //minimo el numero  que lleva el + y el maximo el numero ()
    };
    
   
    
    
}//fin del metodo
