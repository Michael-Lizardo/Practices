
package practicas;

import java.util.Scanner;

/**
 *
 * @author Arialdys
 */
public class Practicas {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String nombre = "";
        String correo = "";
        System.out.println("Ingrese su nombre y correo electronico. ");
       
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su correo: ");
        correo = sc.nextLine();
        System.out.println("Su nombre es "+ nombre + " y su correo es (" + correo + ")");
    }
    
}
