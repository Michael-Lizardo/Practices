
package practicas;
import java.util.Scanner;
/**
 *
 * @author Arialdys
 */
public class Ope_Matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        
        System.out.println("<Operaciones matematicas>");
        System.out.println("Ingrese la operacion que desea realizar: \n 1) Sumar \n 2) Restar \n 3) Multiplicar \n 4) Dividir");
        int operacion = sc.nextInt();
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                break;
                 case 2:
                resultado = num1 - num2;
                break;
                 case 3:
                resultado = num1 * num2;
                break;
                 case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Elige una opcion dentro del rango...");
                return;
        }
        System.out.println("El resultado de la operacion fue: " + resultado);
    }
    
}
