/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

/**
 *
 * @author Milton
 */

import java.util.Scanner;

public class DivisionSegura {
    public static void dividir() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int a = sc.nextInt();

            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();

            System.out.println("Resultado: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}

