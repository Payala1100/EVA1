/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_16_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        char tipo;
        Scanner Cap; Cap = new Scanner(System.in); 
        System.out.println("Tipo de persona F---> Fisica / M --->Moral");
        tipo = Cap.nextLine().charAt(0);
    
        System.out.println(tipo);
        
        if(tipo == 'f'){
            System.out.println("Fisica");
        }else{
            System.out.println("Moral");
        }
        
        
    }
    
}
