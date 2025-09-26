/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Milton
 */
public class tp3_AlvarezMilton {
    public static void main(String[] args) {
        /* Ejercicio 1 */
        Estudiante e = new Estudiante("Milton", "Alvarez", "Programacion 2", 8);
        e.mostrarInfo();
        e.subirCalificacion(1.5);
        e.mostrarInfo();
        e.bajarCalificacion(3);
        e.mostrarInfo();
        
        /* Ejercicio 2*/
        Mascota m = new Mascota("Luna", "Perro", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();
        
        /* Ejercicio 3*/
        Libro l = new Libro("1984", "George Orwell", 1949);
        l.mostrarInfo();
        l.setAnioPublicacion(-10); // Inválido
        l.setAnioPublicacion(2020); // Válido
        l.mostrarInfo();
        
        /* Ejercicio 4*/
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        g1.envejecer();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
        
        /* Ejercicio 5*/
        NaveEspacial n = new NaveEspacial("Apolo", 50);
        n.avanzar(100); // sin recargar
        n.recargarCombustible(40);
        n.despegar();
        n.avanzar(50);
        n.mostrarEstado();
    }
}
