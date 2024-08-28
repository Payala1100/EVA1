/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre;
       
       Scanner Captura;//Incorapar esta herramienta
       //Inexistente
       Captura = new Scanner(System.in);
       //Darle la interaccion
       System.out.println("Introduce tu nombre; ");
       //Captura, Asignar
       nombre = Captura.nextLine();//Captura de todo el texto
                                   //Hasta que de enter
       System.out.println("------------------------------------------");
       System.out.println("Datos Capturados");
       System.out.println(nombre);
    }
    
}
