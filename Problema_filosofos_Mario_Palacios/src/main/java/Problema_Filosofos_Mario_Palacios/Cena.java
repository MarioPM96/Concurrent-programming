
package Problema_Filosofos_Mario_Palacios;


public class Cena {
    
    public static void main(String [] args){
        //Create Palillos
        Palillo[] palillos = new Palillo[5];
        
        for(int i=0; i<palillos.length; i++){
            palillos[i]=new Palillo(i);
        }
        
        //Create Philosophers
        Filosofo[] filosofos =new Filosofo[5];
        
        for(int i=0; i<filosofos.length;i++){
            filosofos[i]=new Filosofo(i, palillos[i], palillos[(i+1)%5]); 
        }
                
        //Make the philosopher eat        
        for(int i=0;i<filosofos.length;i++){
            filosofos[i].start();
        }
    }
}
