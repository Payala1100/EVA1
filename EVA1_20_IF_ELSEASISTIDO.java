/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_if_else.asistido;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_20_IF_ELSEASISTIDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day;
       
       Scanner cap; cap = new Scanner(System.in);
       
       System.out.println("Dime un numero entre e 1 y el 7");
       day = cap.nextInt();
       
       
       if(day == 1){
           System.out.println("Domingo");
       }else if(day==2){
           System.out.println("Lunes");
       }else if(day==3){
           System.out.println("Martes");
       }else if(day==4){
           System.out.println("Miercoles");
       }else if(day==5){
           System.out.println("Jueves");
       }else if(day==6){
           System.out.println("Viernes");
       }else if(day==7){
           System.out.println("Sabado");
       }else{
           System.out.println("Numero no Posible de Procesar :( ");
       }
    }
    
}
