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
public class Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar si es par o impar. \n Ingrese un numero: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par.");
        }
        else{
            System.out.println("El numero es impar.");
        }
    }
    
}
