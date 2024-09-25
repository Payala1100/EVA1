/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int kilometraje, ult;
       
       Scanner cap; cap = new Scanner(System.in);
       
       System.out.println("Dime el kilometraje De Su Vehiculo");
       kilometraje = cap.nextInt();
       System.out.println("hace cuantos meses fue el cambio de aceite");
       ult = cap.nextInt();
       
       
       if(kilometraje >= 5000 || ult >= 6){
           System.out.println("Tu Vehivulo Necesita un Cambio de Aceite");
       }else{
           System.out.println("Tu Auto Esta Muy Bien :) ");
       }
    }
    
}
