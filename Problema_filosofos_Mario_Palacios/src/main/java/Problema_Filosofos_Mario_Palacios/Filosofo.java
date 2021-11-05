
package Problema_Filosofos_Mario_Palacios;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Filosofo extends Thread {
    private int id_filosofo;
    private Palillo left, right;
    private Silla silla;
    
    
    public Filosofo(int id_filosofo, Palillo left, Palillo right, Silla silla){ 
       this.id_filosofo=id_filosofo;
       this.left=left;
       this.right=right;
       this.silla=silla;
    }

    

   
    
    public void run(){
        while(true){
            try {
                silla.ocupar_silla(id_filosofo);
                left.takePal(id_filosofo);
                right.takePal(id_filosofo);
                
                right.leavePal(id_filosofo);
                left.leavePal(id_filosofo);
                silla.dejar_silla(id_filosofo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
