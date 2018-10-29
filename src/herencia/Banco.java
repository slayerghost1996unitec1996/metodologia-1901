/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author T-107
 */
public class Banco {
    public static void main(String[] args){
        
        //primero creamos tarjeta de credito
        TarjetaCredito t1=new TarjetaCredito();
        //le asignamos un numero 
        t1.setNumero(666);
        
        //segundo creamos tarjeta ahorro
       TarjetaAhorro t2=new TarjetaAhorro();
        //le asignamos un numero
       t2.setNumero(4321);
        
        //tercero creamos tarjeta nomina
       //TarjetaNomina t3=new TarjetaNomina();
      //t3.setNumero(666);
      
             
              
       System.out.println("el numero de la tarjeta t3 es "+t1.getNumero());
       
        
      
    }
}
