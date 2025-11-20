/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Milton
 */
public class ejercicio8 {
    
}

class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;

    public Documento(String titulo, String contenido, Usuario8 usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital("HASH123", "2024-01-01", usuario);
    }
}

class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario8 usuario;

    public FirmaDigital(String codigoHash, String fecha, Usuario8 usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
}

class Usuario8 {
    private String nombre;
    private String email;
}