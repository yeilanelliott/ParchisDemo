/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ellio
 */
public class TableroCoordenadas {

    //Arreglo
    private Coordenadas[] recorrido = new Coordenadas[]{
        new Coordenadas(305, 476),//1
        new Coordenadas(305, 454),//2
        new Coordenadas(305, 432),//3
        new Coordenadas(305, 409),//4
        new Coordenadas(305, 381),//5 AMARRILLO
        new Coordenadas(305, 359),//6
        new Coordenadas(305, 336),//7
        new Coordenadas(305, 314),//8
        new Coordenadas(316, 295),//9
        new Coordenadas(341, 310),//10
        new Coordenadas(363, 311),//11
        new Coordenadas(388, 297),//12 SEGURA
        new Coordenadas(410, 310),//13
        new Coordenadas(435, 311),//14
        new Coordenadas(458, 310),//15
        new Coordenadas(482, 312),//16
        new Coordenadas(481, 244),//17 SEGURA
        new Coordenadas(481, 187),//18
        new Coordenadas(459, 187),//19
        new Coordenadas(435, 187),//20
        new Coordenadas(411, 187),//21
        new Coordenadas(388, 188),//22 AZUL
        new Coordenadas(364, 187),//23
        new Coordenadas(342, 187),//24
        new Coordenadas(317, 187),//25
        new Coordenadas(304, 175),//26
        new Coordenadas(308, 153),//27
        new Coordenadas(307, 131),//28
        new Coordenadas(303, 106),//29 SEGURA
        new Coordenadas(306, 84),//30
        new Coordenadas(306, 61),//31
        new Coordenadas(306, 38),//32
        new Coordenadas(306, 15),//33
        new Coordenadas(249, 12),//34 SEGURA
        new Coordenadas(194, 14),//35
        new Coordenadas(191, 39),//36
        new Coordenadas(191, 62),//37
        new Coordenadas(191, 84),//38
        new Coordenadas(196, 106),//39 ROJO
        new Coordenadas(191, 132),//40
        new Coordenadas(193, 154),//41
        new Coordenadas(196, 174),//42
        new Coordenadas(181, 184),//43
        new Coordenadas(157, 188),//44
        new Coordenadas(134, 188),//45
        new Coordenadas(111, 186),//46
        new Coordenadas(88, 188),//47
        new Coordenadas(65, 188),//48
        new Coordenadas(40, 188),//49
        new Coordenadas(18, 188),//50
        new Coordenadas(18, 242),//51 SEGURA
        new Coordenadas(18, 315),//52
        new Coordenadas(40, 315),//53
        new Coordenadas(64, 315),//54
        new Coordenadas(88, 315),//55
        new Coordenadas(111, 315),//56 VERDE
        new Coordenadas(135, 315),//57
        new Coordenadas(157, 315),//58
        new Coordenadas(181, 294),//59
        new Coordenadas(193, 315),//60
        new Coordenadas(191, 338),//61
        new Coordenadas(189, 361),//62
        new Coordenadas(195, 380),//63 SEGURA
        new Coordenadas(191, 406),//64
        new Coordenadas(191, 432),//65
        new Coordenadas(191, 454),//66
        new Coordenadas(191, 477),//67
        new Coordenadas(249, 473),//68 SEGURA
    };

    //Falta las coordenadas de caminos win (7 casillas)
    //[4][7]
    //No son métodos, son atributos tipo objeto y arreglo
    private Coordenadas[][] caminoWin = new Coordenadas[][]{
        //Rojo
        //Coordenadas inventadas de todos los colores , cambiar
        {
            new Coordenadas(250, 39),//1 Zona win Rojo
            new Coordenadas(250, 62),//2 Zona win Rojo 
            new Coordenadas(250, 84),//3 Zona win Rojo 
            new Coordenadas(250, 108),//4 Zona win Rojo 
            new Coordenadas(250, 132),//5 Zona win Rojo 
            new Coordenadas(250, 154),//6 Zona win Rojo 
            new Coordenadas(250, 179),//7 Zona win Rojo 
        },
        //Amarillo
        {
            new Coordenadas(251, 454),//1 Zona win Amarillo 
            new Coordenadas(251, 430),//2 Zona win Amarillo 
            new Coordenadas(251, 409),//3 Zona win Amarillo 
            new Coordenadas(251, 385),//4 Zona win Amarillo 
            new Coordenadas(251, 360),//5 Zona win Amarillo 
            new Coordenadas(251, 338),//6 Zona win Amarillo 
            new Coordenadas(251, 317),//7 Zona win Amarillo 
        },
        //Azul
        {
            new Coordenadas(459, 247),//1 Zona win Azul 
            new Coordenadas(435, 247),//2 Zona win Azul 
            new Coordenadas(413, 247),//3 Zona win Azul 
            new Coordenadas(387, 247),//4 Zona win Azul 
            new Coordenadas(364, 247),//5 Zona win Azul 
            new Coordenadas(343, 247),//6 Zona win Azul 
            new Coordenadas(316, 247),//7 Zona win Azul 
        },
        //Verde
        {
            new Coordenadas(40, 245),//1 Zona win Verde
            new Coordenadas(67, 245),//2 Zona win Verde
            new Coordenadas(89, 245),//3 Zona win Verde
            new Coordenadas(112, 245),//4 Zona win Verde
            new Coordenadas(135, 245),//5 Zona win Verde
            new Coordenadas(157, 245),//6 Zona win Verde
            new Coordenadas(184, 245),//7 Zona win Verde
        }
    };

    private Coordenadas[] metas = new Coordenadas[]{
        //Coordenadas inventadas, cambiar
        new Coordenadas(250, 212),//0 Zona win Rojo 
        new Coordenadas(251, 289),//1 Zona win Amarillo 
        new Coordenadas(290, 247),//2 Zona win Azul
        new Coordenadas(211, 245),//3 Zona win Verde
    };
    //Método para obtenner las casillas

    //Recorrido principal
    public int getCasillas() {
        return recorrido.length;
    }//fin del metodo getCasillas
    //Método obtener las posiciones

    //Dibuja la posicion de la ficha
    public Coordenadas getPosicion(int indiceGeneral) {
        return recorrido[indiceGeneral];
    }//fin del método getPosicion

    //Método para caminar o avanzar en el camino a win de cada color
    public Coordenadas getCaminoWin(int colorId, int step) {
        return caminoWin[colorId][step];
    }// fin del método getCaminoWin

    //Lee el tamaño y avanza según caminoWin
    public int getAvanzarFichaWin(int colorId) {
        return caminoWin[colorId].length;
    }//fin del método avanzarFicha

    //Método de meta según el color de la ficha
    public Coordenadas getMetas(int colorId) {
        return metas[colorId];
    }//fin del método getMetas

}//fin del arrelgo y metodos 
