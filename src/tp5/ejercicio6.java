/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Milton
 */
public class ejercicio6 {
    
}

class Reserva {
    private String fecha;
    private String hora;
    private Cliente6 cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente6 cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
}

class Cliente6 {
    private String nombre;
    private String telefono;
}

class Mesa {
    private int numero;
    private int capacidad;
}