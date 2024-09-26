/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_21_switc;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_21_SWITC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int dia;
          Scanner cap;
          cap = new Scanner(System.in);
          System.out.println("Escribe un Numero del 1 al 7");
          dia = cap.nextInt();
          
          switch(dia){
              case 1:
                  System.out.println("Domingo");
                  break;
               case 2:
                 System.out.println("Lunes");
                  break;
               case 3:
                  System.out.println("Martes");
                  break;
               case 4:
                  System.out.println("Miercoles");
                  break;
               case 5: 
                   System.out.println("Jueves");
                  break;
               case 6: 
                   System.out.println("Viernes");
                  break;
               case 7:
                   System.out.println("Sabado");
                  break;
               
          }
    }
    
}
