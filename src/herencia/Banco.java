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
     
        //primero creamos una tarjeta de credito
    TarjetaCredito tcredito=new TarjetaCredito();
    tcredito.setNumero(1234);
    tcredito.setNombre("banamex");
    tcredito.setTipo("credito");
    tcredito.setSaldo(100);
    
    TarjetaAhorro tahorro=new TarjetaAhorro();
    tahorro.setNumero(4321);
    tahorro.setNombre("bancomer");
    tahorro.setTipo("ahorro");
    tahorro.setSaldo(100);
    
    TarjetaNomina tnomina=new TarjetaNomina();
    tnomina.setNumero(777);  
    tnomina.setNombre("hsbc");
    tnomina.setTipo("nomina");
    tnomina.setSaldo(100);
    
    //generamos el codigo de deposito
   //vamos a hacerlo de la forma mas basica 
   
   //tarjeta de nomina
   
   //tnomina.pagar(150);
   
   //tarjeta ahorro
   
  // tahorro.pagar(150);
   
  // tcredito.pagar(150);
   
   //generamos un arreglo
   
   Tarjeta tarjetas[]=new Tarjeta[3];
   tarjetas[0]=tnomina;
   tarjetas[1]=tcredito;
   tarjetas[2]=tahorro;
    
   //iteramos al arreglo
   
   for(Tarjeta t: tarjetas){
       t.pagar(150);
       
       System.out.println("saldo es "+t.getSaldo()+" tipo "+t.getTipo());
       
   }
   
    }
}
