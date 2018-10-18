/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.print.DocFlavor;

/**
 *
 * @author T-107
 */
public class probartodo {
    
    public static void main(String[] args) {
        Opcion op1=new Opcion("el azucar y la harina", true);
       
        System.out.println("tu titulo es "+op1.titulo);
        
          System.out.println("es correcta "+op1.correcta);
          
    Opcion op2=new Opcion("la grasa", false);
    Opcion op3=new Opcion("el sol", false);
    Opcion op4=new Opcion("la contaminacion", false);
    Opcion op5=new Opcion("la sal", false);     
   
    Opcion[] opciones={op1,op2,op3,op4,op5};
    
   pregunta p1=new pregunta("esta es la principal causa del cancer ",opciones);
   
System.out.println(p1.titulo);

        for (Opcion opcion : opciones) {
            System.out.println(opcion.titulo);
        }
        }
    
}
