/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7;

/**
 *
 * @author Milton
 */


abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSueldo();
}

class EmpleadoPlanta extends Empleado {
    private double salarioFijo;

    public EmpleadoPlanta(String nombre, double salarioFijo) {
        super(nombre);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSueldo() {
        return salarioFijo;
    }
}

class EmpleadoTemporal extends Empleado {
    private int horas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, int horas, double valorHora) {
        super(nombre);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horas * valorHora;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Empleado[] empleados = {
                new EmpleadoPlanta("Juan", 250000),
                new EmpleadoTemporal("Ana", 80, 2000),
                new EmpleadoTemporal("Luis", 120, 1500)
        };

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.nombre +
                    " | Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println(" -> Empleado de planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" -> Empleado temporal");
            }
        }
    }
}

