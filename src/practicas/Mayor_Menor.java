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
public class Mayor_Menor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para identificar el mayor. \n Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es mayor.");
        } else if (num1 == num2) {
            System.out.println("Ambos numeros son iguales.");
        } else {
            System.out.println("El segundo numero es mayor.");
        }

    }

}
