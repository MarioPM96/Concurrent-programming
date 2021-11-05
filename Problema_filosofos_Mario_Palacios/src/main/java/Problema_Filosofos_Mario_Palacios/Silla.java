/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema_Filosofos_Mario_Palacios;

/**
 *
 * @author MPALACIOS
 */
public class Silla {
    private int free_chairs=4;
    
    public synchronized void ocupar_silla(int i) throws InterruptedException{
        while(free_chairs==0){
            wait();
        }
        System.out.println("El filósofo: " +i+ "se sienta en una silla");
        free_chairs--;
    }
    
    public synchronized void dejar_silla(int i){
        free_chairs++;
        System.out.println("El filósofo: "+i+" libera una silla");
        notify();
    }
}
