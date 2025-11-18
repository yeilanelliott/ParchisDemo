/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ellio
 */
public class CoordenadasHome {

    private Coordenadas[] home = new Coordenadas[]{
        new Coordenadas(100, 95),//Rojo
        new Coordenadas(400, 381),//Amarillo
        new Coordenadas(388, 188),//Azul
        new Coordenadas(111, 315)//Verde
    };

    //Metodo paea deternimanr la ubicacion de las fichas
    public Coordenadas getHome(int colorId) {
        if (colorId < 0) {
            colorId = 0;

        }
        if (colorId > 3) {
            colorId = 3;
        }
        return home[colorId];
    }

}//fin del metodo
