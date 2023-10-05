/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josep
 */
public class EVA_2_HILOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                // Cualquier tarea que se quiera ejecutar
                // No necesarimente de duración infinita
                for (int i = 0; i < 10; i++){
                System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EVA_2_HILOS.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            }
            
        };
        // Runnable no se ejecuta directamente
        // Se debe ejecutar a través de un thread
        Thread thread = new Thread(runnable);
        thread.start();
        /*-----------------*/
        clsHilo miHilo = new clsHilo();
        miHilo.start();
    }
    
}
