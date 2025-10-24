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
    private int numero;
    private CoordenadasHome home;
    
    //Constructor
    public Dado(Random random, int numero) {
        this.random = random;
        this.numero = numero;
    }
    
    //Metodos
    public int dadosAleatorios(){
        numero = random.nextInt(6)+1; //minimo el numero  que lleva el + y el maximo el numero ()
        return numero;
    };
    
   
    
    
}//fin del metodo
