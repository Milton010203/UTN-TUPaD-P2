/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Milton
 */
public class ejercicio4 {
    
}

class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente4 cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente4 cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this);
    }
}

class Cliente4 {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
}

class Banco {
    private String nombre;
    private String cuit;
}