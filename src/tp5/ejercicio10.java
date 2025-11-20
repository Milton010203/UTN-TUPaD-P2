/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Milton
 */
public class ejercicio10 {
    
}

class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular10 titular;

    public CuentaBancaria(String cbu, double saldo, Titular10 titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad("ABC123", "2024-01-01");
        this.titular = titular;
        titular.setCuenta(this);
    }
}

class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
}

class Titular10 {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
}
