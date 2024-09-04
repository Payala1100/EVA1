/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
        char Genero;
        int  Duracion;
        String Reparto;
        String Clasificacion;
        
        //Asignacio
        
        Scanner Captu;
        Captu = new Scanner(System.in);
       
        
        System.out.println("Escribe EL Nombre de la Pelicula:");
        Nombre = Captu.nextLine();
        System.out.println("Escirbe el Genero");
        Genero = Captu.next().charAt(0);
        System.out.println("Escribe su Duracion en Segundos");
        Duracion  = Captu.nextInt();
        System.out.println("Escribe el Reaparto de Actores");
        Reparto  = Captu.nextLine();
        System.out.println("Escribe Su Clasificacion");
        Clasificacion  = Captu.nextLine();
        
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Pelicula;  "+ Nombre);
        System.out.println("Genero; "+Genero);      
        System.out.println("Duracion: "+Duracion);
        System.out.println("Reparto: "+Reparto);
        System.out.println("Clsificacion: "+Clasificacion);
        
    }
    
}
