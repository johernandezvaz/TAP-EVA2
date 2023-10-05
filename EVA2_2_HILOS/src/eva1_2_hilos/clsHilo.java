/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_2_hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josep
 */
public class clsHilo extends Thread {

    @Override
    public void run() {
        super.run(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(2000);
                System.out.println("Clase Thread" + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(clsHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
