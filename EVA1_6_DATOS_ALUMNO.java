/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_variables2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_DATOS_ALUMNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Nombre;
        String Curp;
        int  Edad;
        double Promedio;

        //Asignacio
        
        Scanner Captu;
        Captu = new Scanner(System.in);
        
        System.out.println("Escribe tu Nombre");
        Nombre = Captu.nextLine();
        System.out.println("Escribe tu Curp");
        Curp = Captu.nextLine();
        System.out.println("Escirbe tu Edad");
        Edad  = Captu.nextInt();
        System.out.println("Escribe tu Promedio");
        Promedio = Captu.nextDouble();
        
        System.out.println(Nombre);
        System.out.println(Curp);      
        System.out.println(Edad);
        System.out.println(Promedio);
        
        
        
    }
    
}
