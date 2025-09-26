/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Milton
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    private double capacidadMaxima;

    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
        this.capacidadMaxima = 100;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("Combustible insuficiente para despegar.");
        }
    }

    public void avanzar(double distancia) {
        double consumo = distancia * 0.5;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= capacidadMaxima) {
            combustible += cantidad;
        } else {
            combustible = capacidadMaxima;
            System.out.println("Se recargó al máximo.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " - Combustible: " + combustible + "/" + capacidadMaxima);
    }  
}
