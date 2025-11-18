/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 *
 * @author ellio
 */
public class Sonido {
    //Atributo para el objeto musica
    private Clip musica;
    
    //Metodo para cargar audio y sonido
    private Clip cargar(String ruta){
        try{
            URL u = getClass().getResource(ruta);
            //Esta es la forma correcta en JAVA para cargar archivos que estan dentro del proyecto
            AudioInputStream ais = AudioSystem.getAudioInputStream(u);
            //Es necesario si quieres reproducir un archivo de sonido usando Clip
            Clip c = AudioSystem.getClip();
            c.open(ais);
            return c;
        }catch (Exception e){
            return null;
        }
    }//Fin del metodo cargar 
    
    public void musicaFondo(){
        //dentro de las llaves va los sonidos mios 
        musica = cargar("/sonido/musicaFondoPrincipal.wav");
        if(musica != null) musica.loop(Clip.LOOP_CONTINUOUSLY);
    }//Fin del metodo
    
    public void detenerFondo(){
        if(musica != null) musica.stop();
    }
    
    public void click(){
        Clip c = cargar ("/sonido/click.wav");
        if(c != null) c.start();
    }
    
    public void gana(){
        Clip c = cargar("/sonido/win.wav");
        if(c != null) c.start();
    }
    
    public void pierde(){
        Clip c = cargar("/sonido/derrota.wav");
        if(c != null) c.start();
    }
    
}//Fin de la clase 
