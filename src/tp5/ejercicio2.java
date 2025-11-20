/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Milton
 */
public class ejercicio2 {
    
}

class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario2 usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario2 usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
        usuario.setCelular(this);
    }
}

class Bateria {
    private String modelo;
    private int capacidad;
}

class Usuario2 {
    private String nombre;
    private String dni;
    private Celular celular;

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
}