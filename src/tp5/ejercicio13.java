/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Milton
 */
public class ejercicio13 {
    
}

class Usuario13 {
    private String nombre;
    private String email;
}

class CodigoQR {
    private String valor;
    private Usuario13 usuario;

    public CodigoQR(String valor, Usuario13 usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
}

class GeneradorQR {
    public void generar(String valor, Usuario13 usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado");
    }
}