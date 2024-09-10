/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_14_califa;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_14_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa;
         Scanner Captu;
         
         Captu = new Scanner(System.in);
         
         System.out.println("Escribe es tu calificacion:");
         califa = Captu.nextInt();
         
         if(califa >= 70){
         
        System.out.println("ACREDITAS");
 
        }else{
            
        System.out.println("NA");
        
        }
         
         
        
        
    }
    
}
