/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.SwingUtilities;
import view.PanelControl;

/**
 *
 * @author ellio
 */
public class Temporizador extends Thread {

    private PanelControl panel;
    private boolean activo;
    private int segundos;

    public Temporizador(PanelControl panel) {
        this.panel = panel;
        this.activo = true;
        this.segundos = 0;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public void run() {
        while (activo) {
            try {
                Thread.sleep(1000);//un segundo
            } catch (InterruptedException e) {
                activo = false;
                break;
            }

            segundos++;
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    panel.setTxtTiempo(segundos);
                }
            });

        }

    }
//detiene el hilo 

    public void detener() {
        activo = false;
        interrupt();
    }
// Reinicia el conteo a 0

    public void reiniciar() {
        segundos = 0;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                panel.setTxtTiempo(segundos);
            }
        });
    }

}// fin de la clase
