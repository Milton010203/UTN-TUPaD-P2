/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Milton
 */
public class ejercicio12 {
    
}

class Contribuyente {
    private String nombre;
    private String cuil;
}

class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
}

class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto...");
    }
}