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
public class EVA1_7_CAPTURA_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Marca
        //Modelo
        //Año
        //Kilometraje
        //No.Cilindros
        
        String Marca;
        String Modelo;
        int  Auto;
        double Precio;

        //Asignacio
        
        Scanner Captu;
        Captu = new Scanner(System.in);
        
        System.out.println("");
        Marca = Captu.nextLine();
        System.out.println("");
        Modelo = Captu.nextLine();
        System.out.println("");
        Auto  = Captu.nextInt();
        System.out.println("");
        Precio  = Captu.nextDouble();
        
        System.out.println(Marca);
        System.out.println(Modelo);      
        System.out.println(Auto);
        System.out.println(Precio);
        
        
        
    }
    
}
