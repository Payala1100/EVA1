/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_fharenheit_a_centigrados;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_11_FHARENHEIT_A_CENTIGRADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      double f; 
      double c;
      double k;
      
      double f1; 
      double c1,c2;     
      double k1;
      
      Scanner Captura;
      
      Captura = new Scanner(System.in);
  
     System.out.println("Los Valores de X = 10 , B = 5 , Y = 5 , C = 2");
     System.out.println("-------------------------------------------------------------------------------");
     System.out.println("Dame los Grados Farenheit: ");
     f = Captura.nextDouble();
     c1 = (f - 32)/1.8;
     
     System.out.println("Dame los Grados Centigrados: ");
     c = Captura.nextDouble();
     f1 = (c * 9/5)+32;
     
     System.out.println("Dame los Grados Centigrados para Pasarlos a Kelivn: ");
     c2 = Captura.nextDouble();
     k1 = c + 273.15;
     
     System.out.println("El resultado a °Centigrados: " + c1);
     System.out.println("El resultado a °Farenheit: "  + f1);
     System.out.println("El resultado a °Kelvin: "  + k1);
    }
    
}
