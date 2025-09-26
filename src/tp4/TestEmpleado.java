/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author Milton
 */
public class TestEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Milton Alvarez", "Manager", 80000);
        Empleado e2 = new Empleado("Constanza Villabla", "Gerente");
        Empleado e3 = new Empleado("Juan Cruz Negri", "Analista");

        e1.actualizarSalario(10);
        e2.actualizarSalario(5000); 

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
