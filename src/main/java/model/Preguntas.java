
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author EMILI VALERIA
 */
public class Preguntas {

    private Random random = new Random();
    //CAMBIAR LAS PREGUNTAS DE LOS ARREGLOS 
    private String[][] facil = {
        {"¿El planeta más grande de nuestro sistema solar es Júpiter?", "V"},//1
        {"¿El país conocido como la Tierra del Sol Naciente es Corea?", "F"},//2
        {"¿El océano más grande del mundo es el Atlántico?", "F"},//3
        {"¿Hay seis continentes en la Tierra?", "F"},//4
        {"¿La bandera de China es principalmente azul y blanca?", "F"},//5
        {"¿El mamífero terrestre más grande es el elefante africano?","V"},//6
        {"¿Necesitamos dióxido de carbono para respirar?","F"},//7
        {"¿El río más largo de África es el Nilo?","V"},//8
        {"¿La Torre Eiffel se encuentra en Roma?","F"},//9
        {"¿Leonardo da Vinci pintó la Mona Lisa?","V"},//10
        {"¿a.C. significa antes de la conquista?","F"},//11
        {"¿Los romanos construyeron las pirámides de Guiza?","F"},//12
        {"¿El siglo XX terminó en el año 2000?","V"},//13
        {"¿Miguel de Cervantes escribió Don Quijote de la Mancha?","V"},//14
        {"¿Un pianista toca un violín?","F"},//15
        {"¿El arte de hacer figuras doblando papel se llama origami?","V"},//16
        {"¿Isaac Newton desarrolló la Teoría de la Relatividad?","F"},//17
        {"¿El primer metal que utilizó el ser humano fue el hierro?","F"},//18
        {"¿La Ciudad Eterna es Milán?","F"},//19
        {"¿Un triángulo tiene cuatro lados?","F"},//20
        {"¿El número atómico del Hidrógeno es 1?","V"},//21
        {"¿Un panel solar utiliza energía eólica?","F"},//22
        {"¿La fórmula química del agua es CO2","F"},//23
        {"¿La caja torácica protege el cerebro?","F"},//24
        {"¿La fuerza que nos mantiene en el suelo es la levitación?","F"},//25
        {"¿El agua hierve a 100 grados a nivel del mar?","V"},//26
        {"¿Un byte es una unidad de medida de tiempo?","F"},//27
        {"¿Los murciélagos utilizan la ecolocalización para orientarse?","V"},//28
        {"¿Los murciélagos utilizan la ecolocalización para orientarse?","V"},//29
        {"¿La vitamina que se obtiene del sol es la A?","F"},//30
        {"¿Un equipo de fútbol tiene 11 jugadores en la cancha?","V"},//31
        {"¿Al mezclar azul y amarillo se obtiene verde?","V"},//32
        {"¿El deporte nacional de Japón es el Taekwondo?","F"},//34
        {"¿Brasil ganó el primer Mundial de Fútbol?","F"},//35
        {"¿La capital de Italia es Florencia?","F"},//36
        {"¿Un año bisiesto tiene 366 días?","V"},//37
        {"¿La moneda oficial de Estados Unidos es el euro?","F"},//38
        {"¿La bebida que se obtiene de la fermentación de uvas es la cerveza?","F"},//39
        {"¿El miércoles cae después del martes?","V"},//40
        {"El actual Papa se llama Benedicto XVI?","F"},//41
        {"¿El satélite natural de la Tierra se llama Fobos?","F"},//42
        {"¿El hipocampo forma parte del sistema circulatorio?","F"},//43
        {"¿La fresa es conocida por tener la forma de un corazón en su corte?","V"},//44
        {"¿El personaje principal de Harry Potter se llama Ronald Weasley?","F"},//45
        {"¿El acrónimo ONG significa Organización No Gubernamental?","V"},//46
        {"¿Chile tiene forma de bota?","F"},//47
        {"¿El arcoíris tiene siete colores?","V"},//48
        {"¿El roble produce las bellotas?","V"},//49
        {"¿La capital de España es Barcelona?", "F"}// la ultima pregunta del arreglo
    };

    private String[][] medias = {
        {"¿El desierto no polar más grande del mundo es el Gobi?", "F"},//1
        {"¿El Estrecho de Bering separa Asia de América del Norte?", "V"},//2
        {"¿El Monte Everest se encuentra en los Andes?", "F"},//3
        {"¿La capital de Australia es Sídney?", "F"},//4
        {"¿El país más pequeño del mundo por área es Mónaco?", "F"},//5
        {"¿La escala de Richter mide la intensidad de las inundaciones?", "F"},//6
        {"¿El proceso por el cual las plantas producen alimento se llama fotosíntesis?", "V"},//7
        {"¿Rusia se extiende sobre los Montes Urales, actuando como puente entre Europa y Asia?", "V"},//8
        {"¿El río más caudaloso del mundo es el Amazonas?", "V"},//9
        {"¿Lagos es la ciudad más poblada de África", "V"},//10
        {"¿Thomas Jefferson fue el primer presidente de Estados Unidos?", "F"},//11
        {"¿La Primera Guerra Mundial comenzó en 1914?", "V"},//12
        {"¿Sócrates fue maestro de Alejandro Magno?", "F"},//13
        {"¿La Sagrada Familia es la obra más famosa del arquitecto Gaudí?", "V"},//14
        {"¿Los Incas se desarrollaron en la Península de Yucatán?", "F"},//15
        {"¿El primer objeto en órbita fue el Vostok 1?", "F"},//16
        {"¿Shakespeare es el dramaturgo inglés conocido por Hamlet?", "V"},//17
        {"¿La Declaración de Independencia de EE. UU. fue firmada en 1776?", "V"},//18
        {"¿Marie Curie fue la primera mujer en ganar un Premio Nobel?", "V"},//19
        {"¿La famosa estatua griega de la victoria sin cabeza ni brazos se llama Venus de Milo?", "F"},//20
        {"¿La entomología estudia los insectos?", "V"},//21
        {"¿El fémur es el hueso más largo del cuerpo humano?", "V"},//22
        {"¿Isaac Newton propuso la Ley de Gravitación Universal?", "V"},//23
        {"¿Los electrones, protones y neutrones son componentes del núcleo celular?", "F"},//24
        {"¿La unidad de medida de la resistencia eléctrica es el voltio?", "F"},//25
        {"¿La capa de la atmósfera que nos protege de la radiación UV es la troposfera?", "F"},//26
        {"¿El principal componente del gas natural es el metano?", "V"},//27
        {" ¿El símbolo químico FE corresponde al elemento Sodio?", "F"},//28
        {" ¿Las siglas ADN significan Ácido Desoxirribonucleico?", "V"},//29
        {"¿La célula sexual masculina se llama óvulo?", "F"},//30
        {"¿Michael Phelps ganó 23 medallas de oro olímpicas?", "V"},//31
        {"¿La especialidad del chef Gordon Ramsay es la repostería?", "F"},//32
        {"¿El Coliseo se encuentra en Atenas?", "F"},//33
        {"¿En el baloncesto se utiliza la palabra strike?", "F"},//35
        {"¿El perro de Tintín se llama Milú?", "V"},//36
        {"¿El murciélago es el único mamífero capaz de volar?", "V"},//37
        {"¿Arthur Conan Doyle creó el personaje de Sherlock Holmes?", "V"},//38
        {"¿El término quinto arte se refiere a la pintura?", "F"},//39
        {"¿El principal ingrediente de la tortilla española es la patata?", "V"},//40
        {"¿El águila es el animal símbolo de la paz?", "F"},//41
        {"¿El Día de la Tierra se celebra el 22 de abril?", "V"},//42
        {"¿Beethoven es el compositor famoso por sus nueve sinfonías y su sordera?", "V"},//43
        {"¿Colombia es el mayor productor de café del mundo?", "F"},//44
        {"¿El tango es originario de México?", "F"},//45
        {"¿El judo es un arte marcial?", "V"},//46
        {"¿El famoso reloj del Parlamento de Londres se llama St. Paul?", "F"},//47
        {"¿El clima y el tiempo atmosférico son lo mismo?", "F"},//48
        {"¿Gabriel García Márquez es el autor de Cien años de soledad?", "V"},//49
        {"¿A la poesía se le llama la 'décima musa'?", "F"}// la ultima pregunta del arreglo
    };

    private String[][] dificiles = {
        {"¿Nigeria es el país africano que usa el francés y se divide en 10 regiones?", "F"},//1
        {"¿El punto más profundo de los océanos es la Fosa de Puerto Rico?", "F"},//2
        {"¿Indonesia está formado por más de 17.000 islas?", "V"},//3
        {"¿El volcán más alto de Europa es el Teide?", "F"},//4
        {"¿Estados Unidos es el mayor productor mundial de oro?", "F"},//5
        {"¿Estados Unidos es el mayor productor mundial de oro?", "F"},//6
        {"¿La capital de Sri Lanka es Colombo?", "F"},//7
        {"¿El proceso de solidificación del magma bajo la superficie se llama metamorfismo?", "F"},//8
        {"¿El Mar Muerto es un lago salado sin salida entre Israel y Jordania?", "V"},//9
        {"¿La unidad de medida de la presión atmosférica en el SI es el pascal?", "V"},//10
        {"¿Un monzón es una corriente marina cálida?", "F"},//11
        {"¿Hatshepsut fue la única mujer en gobernar Egipto con título de faraón en la Dinastía XVIII?", "V"},//12
        {"¿El Muro de Berlín cayó en 1989?", "V"},//13
        {"¿La Batalla de Trafalgar destruyó la Armada Invencible?", "F"},//14
        {"¿El nombre real de El Greco era Domenico Theotocópuli?", "V"},//15
        {"¿Camilo Cienfuegos fue líder de la Revolución Cubana, además de Fidel Castro?", "V"},//16
        {"¿El Cubismo descompone figuras y objetos en formas geométricas?", "V"},//17
        {"¿Nerón legalizó el cristianismo?", "F"},//18
        {"¿Eurípides es el dramaturgo famoso por Edipo Rey?", "F"},//19
        {"¿La sustancia que da el color rojo a Tiziano es la cochinilla?", "V"}//la ultima pregunta del arreglo
    };

    public boolean preguntasVF(int dificultad) {
        String[][] banco;
        if (dificultad == 1) {
            banco = facil;
        } else if (dificultad == 2) {
            banco = medias;
        } else {
            banco = dificiles;
        }

        //
        int indice = random.nextInt(banco.length);
        String pregunta = banco[indice][0];
        String respuestas = banco[indice][1];

        String titulo = "Pregunta";

        int option = JOptionPane.showConfirmDialog(null, pregunta + "\n\n Seleccione: Si = Verdadero, No = Falso", titulo, JOptionPane.YES_NO_OPTION);
        String respuestaJugador;
        if (option == JOptionPane.YES_OPTION) {
            respuestaJugador = "V";
        } else {
            respuestaJugador = "F";
        }
        boolean correcta;
        if (respuestaJugador.equals(respuestas)) {
            correcta = true;
        } else {
            correcta = false;
        }

        String mensaje;
        if (correcta) {
            if (dificultad == 1) {
                mensaje = "Correcto ganaste 1 punto";
            } else if (dificultad == 2) {
                mensaje = "Correcto ganaste 2 punto";
            } else {
                mensaje = "Correcto ganaste 3 punto";
            }

        } else {
            if (dificultad == 1) {
                mensaje = "Incorrecto perdiste 1 punto";
            } else if (dificultad == 2) {
                mensaje = "Incorrecto perdiste 2 punto";
            } else {
                mensaje = "Incorrecto perdiste 3 punto";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);

        return correcta;
    }//fin metodo

}// fin de la clase
