/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

/**
 *
 * @author Milton
 */

public class MainTP8 {
    public static void main(String[] args) {

        Cliente c = new Cliente("Milton");
        Pedido pedido = new Pedido(c);

        pedido.agregarProducto(new Producto("Mouse", 15000));
        pedido.agregarProducto(new Producto("Teclado", 25000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        pedido.cambiarEstado("EN PREPARACIÓN");

        TarjetaCredito tc = new TarjetaCredito();
        double totalConDescuento = tc.aplicarDescuento(total);
        tc.procesarPago(totalConDescuento);
    }
}

