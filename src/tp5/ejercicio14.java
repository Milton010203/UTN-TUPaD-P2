/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

/**
 *
 * @author Milton
 */
public class ejercicio14 {
    
}

class Proyecto {
    private String nombre;
    private int duracionMin;
}

class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
}

class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato, proyecto);
        System.out.println("Render generado");
    }
}