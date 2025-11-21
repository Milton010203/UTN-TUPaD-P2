/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author Milton
 */


import java.util.ArrayList;
import java.util.List;

class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        cursos.remove(c);
        if (c.getProfesor() == this) c.setProfesor(null);
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso c : cursos)
            System.out.println(" - " + c.getCodigo() + ": " + c.getNombre());
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | Especialidad: " + especialidad +
                " | Cursos: " + cursos.size());
    }
}

class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        if (this.profesor != null)
            this.profesor.eliminarCurso(this);

        this.profesor = p;

        if (p != null && !p.cursos.contains(this))
            p.cursos.add(this);
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + codigo + " | " + nombre +
                " | Profesor: " + (profesor != null ? profesor.getId() : "Sin asignar"));
    }
}

class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) { profesores.add(p); }
    public void agregarCurso(Curso c) { cursos.add(c); }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores)
            if (p.getId().equals(id)) return p;
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos)
            if (c.getCodigo().equals(codigo)) return c;
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) c.setProfesor(p);
    }

    public void listarProfesores() {
        for (Profesor p : profesores) p.mostrarInfo();
    }

    public void listarCursos() {
        for (Curso c : cursos) c.mostrarInfo();
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("P1", "Juan Perez", "Matemática");
        Profesor p2 = new Profesor("P2", "Ana Gomez", "Programación");
        Profesor p3 = new Profesor("P3", "Luis Sosa", "Física");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "POO");
        Curso c3 = new Curso("C3", "Física I");
        Curso c4 = new Curso("C4", "Cálculo I");
        Curso c5 = new Curso("C5", "Estructuras");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C3", "P3");

        uni.listarCursos();
        uni.listarProfesores();
    }
}
