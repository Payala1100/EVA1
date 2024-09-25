/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_21_meses_o_año;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_21_MESES_O_AÑO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int mounth;
       
       Scanner cap; cap = new Scanner(System.in);
       
       System.out.println("Dime un numero entre e 1 y el 12");
       mounth = cap.nextInt();
       
       
       if(mounth == 1){
           System.out.println("Enero");
       }else if(mounth==2){
           System.out.println("Febrero");
       }else if(mounth==3){
           System.out.println("Marzo");
       }else if(mounth==4){
           System.out.println("Abril");
       }else if(mounth==5){
           System.out.println("Mayo");
       }else if(mounth==6){
           System.out.println("Junio");
       }else if(mounth==7){
           System.out.println("Julio");
       }else if(mounth==8){
           System.out.println("Agosto");
       }else if(mounth==9){
           System.out.println("Septiembre");
       }else if(mounth==10){
           System.out.println("Octubre");
       }else if(mounth==11){
           System.out.println("Noviembre");
       }else if(mounth==12){
           System.out.println("Dicembre");
       }else{
           System.out.println("Numero no Posible de Procesar :( ");
       }
    }
    
}
