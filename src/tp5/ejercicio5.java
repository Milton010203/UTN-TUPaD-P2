/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Milton
 */
public class ejercicio5 {
    
}

class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        this.placa = new PlacaMadre("Default", "XYZ");
        propietario.setComputadora(this);
    }
}

class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
}

class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}