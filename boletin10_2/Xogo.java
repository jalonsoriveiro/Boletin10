/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jalonsoriveiro
 */
public class Xogo {
    private int numero;
    private int numeroXogo;
//    1- Codifica un programa que permita o seguinte xogo  para adiviñar un número .    
//O primeiro xogador  teclea ( utilizando a clase JoptionPane ), un número a adiviñar 
//( entre 1 e 50 ) e o número máximo de intentos que ten o segundo xogador para dar con el . 
//O programa irá sacando por pantaia mensaxes que orienten o segundo xogador sobre se o número
//tecleado e maior ou menor que o número a adiviñar . Fai o programa repetitivo.
    
     public int pedirDatos(){
          numero = (int) Math.floor((Math.random()*50));
         return numero;
          }
     public int pedirNumero(){
      String sc = JOptionPane.showInputDialog(null,"Prueba un numero");
       numeroXogo = Integer.parseInt(sc);      
       while((numeroXogo<=0) || (numeroXogo >50)){
             String sc1 = JOptionPane.showInputDialog(null,"incorrecto,prueba otro numero dentro del rango 1-50");
              numeroXogo = Integer.parseInt(sc1);
          }
        return  numeroXogo;
       
    }
     public void xogoNumeros(){
        int y= pedirDatos();
        int intentos=0;
        int x=pedirNumero();                 
             while (y!=x){  
                 intentos++;
                 System.out.println("intentos "+(y-intentos));                 
                          if (Math.abs(y-x)>20)                         
                          JOptionPane.showMessageDialog(null, "moi lonxe ");
                          else if (Math.abs(y-x)<20 && (Math.abs(y-x)>10)  )                             
                          JOptionPane.showMessageDialog(null, "lonxe");   
                          else if (Math.abs(y-x)<10 && (Math.abs(y-x)>5)  )
                          JOptionPane.showMessageDialog(null, "preto");   
                          else if (Math.abs(y-x)<=5)                             
                          JOptionPane.showMessageDialog(null, "moi preto");   
            if(intentos==y){
                System.out.println("perdiste");
                break;                
            }
            
          x=pedirNumero();
       }
      JOptionPane.showMessageDialog(null, "Ganaste!");     
     
     
}
}
