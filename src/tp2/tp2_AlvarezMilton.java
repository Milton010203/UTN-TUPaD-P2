/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author Milton
 */
public class tp2_AlvarezMilton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Ejercicio 1 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int año = sc.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
        
        /* Ejercicio 2 */
        System.out.print("Ingrese el primer número: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el segundo número: ");
        int n2 = Integer.parseInt(sc.nextLine());;
        System.out.print("Ingrese el tercer número: ");
        int n3 = Integer.parseInt(sc.nextLine());

        int mayor = n1;
        if (n2 > mayor) mayor = n2;
        if (n3 > mayor) mayor = n3;

        System.out.println("El mayor es: " + mayor);

        
        /* Ejercicio 3 */
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
        
        /* Ejercicio 4 */
        System.out.print("Ingrese el precio del producto: ");
        double precio4 = sc.nextDouble();
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        String categoria = sc.next().toUpperCase();

        double descuento4 = 0;
        switch (categoria) {
            case "A":
                descuento4 = 0.10;
                break;
            case "B":
                descuento4 = 0.15;
                break;
            case "C":
                descuento4 = 0.20;
                break;
            default:
                System.out.println("Categoria invalida");
                return;
        }

        double precioFinal4 = precio4 - (precio4 * descuento4);
        System.out.println("Descuento aplicado: " + (descuento4 * 100) + "%");
        System.out.println("Precio final: " + precioFinal4);

        
        /* Ejercicio 5 */
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = sc.nextInt();
            if (numero % 2 == 0 && numero != 0) {
                suma += numero;
            }
        } while (numero != 0);

        System.out.println("La suma de los numeros pares es: " + suma);

        
        /* Ejercicio 6 */
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = sc.nextInt();

            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else ceros++;
        }

        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
        /* Ejercicio 7 */
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
        
        /* Ejercicio 8 */
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase8 = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto8 = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento8 = Double.parseDouble(sc.nextLine());

        double precioFinal8 = precio_fional(precioBase8, impuesto8, descuento8);
        System.out.println("El precio final del producto es: " + precioFinal8);
        
        /* Ejercicio 9 */
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double costoEnvio = CostoEnvio(peso, zona);
        double total = TotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
        /* Ejercicio 10 */
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = sc.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = sc.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        /* Ejercicio 11 */
        System.out.print("Ingrese el precio del producto: ");
        double precio11 = sc.nextDouble();

        double precioFinal = calcularDescuentoEspecial(precio11);
        System.out.println("El precio final con descuento es: " + precioFinal);
        
        /* Ejercicio 12 */
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        precios[2] = 129.99;
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        /* Ejercicio 13 */
        double[] precios13 = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }
    public static double precio_fional(double precioBase, double impuesto, double descuento) {
        double imp = impuesto / 100;
        double desc = descuento / 100;
        return precioBase + (precioBase * imp) - (precioBase * desc);
    }
    
    public static double CostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
    }

    public static double TotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    static double descuentoGlobal = 0.10;

    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        return precioFinal;
    }
    
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosRecursivo(precios, indice + 1);
        }
    }
}
