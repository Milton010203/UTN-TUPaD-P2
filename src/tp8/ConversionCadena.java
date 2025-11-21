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

public class ConversionCadena {
    public static void convertir() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese texto numérico: ");
            int x = Integer.parseInt(sc.nextLine());
            System.out.println("Convertido: " + x);

        } catch (NumberFormatException e) {
            System.out.println("Error: No es un número válido.");
        }
    }
}

