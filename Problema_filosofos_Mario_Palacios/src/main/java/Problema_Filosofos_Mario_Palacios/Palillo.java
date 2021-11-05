
package Problema_Filosofos_Mario_Palacios;


public class Palillo {
    private int id_pal;
    private boolean free=true;
    
    
    public Palillo(int id_palillo){
        this.id_pal=id_palillo;
    }
    
    public synchronized void takePal(int i) throws InterruptedException{
        while (!free)
            wait();
        System.out.println("El filósofo" +i+ "toma el palillo" +id_pal);
        free=false;
    }
    
    public synchronized void leavePal(int i){
        free=true;
        System.out.println("El filósofo" +i+ "deja el palillo" +id_pal);
        notify();
    }
}
