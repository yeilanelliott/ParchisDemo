/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Dado;
/**
 *
 * @author ellio
 */
public class CoordenadasHome {
    private Coordenadas[] home_red = {new Coordenadas (196 , 102)};
    private Coordenadas[] home_amarrillo = {new Coordenadas(305, 381)};
    private Coordenadas[] home_azul = {new Coordenadas(388, 188)};
    private Coordenadas[] home_verde = {new Coordenadas(111, 315)};
    private Dado dado;
    
    //Metodo para sacar la ficha 
     public void fichasFuera(){
        if(dado.dadosAleatorios() == 5){
            Coordenadas[] home_reed = {new Coordenadas (305, 381) };
        }
    
    
    }//fin del metodo
}//fin del metodo
