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
        
        System.out.println("Escribe la Marca");
        Marca = Captu.nextLine();
        System.out.println("Escribe el Modelo");
        Modelo = Captu.nextLine();
        System.out.println("Escribe el Año");
        Auto  = Captu.nextInt();
        System.out.println("Escribe el Precio");
        Precio  = Captu.nextDouble();
        
        System.out.println(Marca);
        System.out.println(Modelo);      
        System.out.println(Auto);
        System.out.println(Precio);
        
        
        
    }
    
}
