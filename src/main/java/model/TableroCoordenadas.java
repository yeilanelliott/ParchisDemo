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
    private int indice;
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
    
    private int salida_amarillo = 5;
    private int salida_azul = 22;
    private int salida_rojo = 39;
    private int salida_verde = 56;

    //Metodo obtener las posiciones
    public Coordenadas getPosicion(int indice) {
        return recorrido[indice];
    }//fin del metodo

    ;
    //Metodo para obtenner las casillas
    public int getCasillas() {
        return recorrido.length;
    }//fin del metodo
;
    //Metodo para avanzar por las casillas 
    public void AvanzarFicha(){
        if(indice < recorrido.length - 1 ){
           indice ++;
        }//fin del else
    }//fin del metodo 
    
    //metodo para reiniciar el juego
    public void reiniciar(){
        indice = 0;
    }//fin del metodo

}//fin del arrelgo y metodos 
