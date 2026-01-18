/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author Arialdys
 */
public class Tabla_Multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tabla = 1;
        int multi = 0;
        System.out.println("Ingrese un numero para ver su tabla.");
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println("<<<<TABLA DEL " + numero +">>>>");
        while (tabla <= 10){
            
            multi = tabla * numero;
            System.out.println(numero + " X " + tabla + " = " + multi);
            
            tabla++;
        }
        
        
        
    }
    
}
