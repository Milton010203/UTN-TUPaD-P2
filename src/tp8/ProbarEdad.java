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

public class ProbarEdad {
    public static void verificar() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();

        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad fuera de rango.");
            }
            System.out.println("Edad válida.");

        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

