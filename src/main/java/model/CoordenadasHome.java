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
    
//HomeRed, HomeAmarillo, HomeAzul, HomeVerde a tener un unico arreglo llamado home

    private Coordenadas[] home = new Coordenadas[]{
        new Coordenadas(196, 102), //Rojo
        new Coordenadas(305, 381),//Amarillo
        new Coordenadas(388, 188),//Azul
        new Coordenadas(111, 315)//Verde
    };
//Va a leer el id de los colores para pintar en el tablero las fichas que van a jugar

    public Coordenadas getHome(int colorId) {
        if (colorId < 0) {
            colorId = 0;
        }
        if (colorId > 3) {
            colorId = 3;
        }
        return home[colorId];
    }

}//Finde la clase
