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

enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() { return id; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }
    public CategoriaProducto getCategoria() { return categoria; }

    public void setCantidad(int nueva) { this.cantidad = nueva; }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre +
                " | Precio: $" + precio + " | Cantidad: " + cantidad +
                " | Categoría: " + categoria + " (" + categoria.getDescripcion() + ")");
    }
}

class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) { productos.add(p); }

    public void listarProductos() {
        for (Producto p : productos) p.mostrarInfo();
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos)
            if (p.getId().equals(id)) return p;
        return null;
    }

    public void eliminarProducto(String id) {
        productos.removeIf(p -> p.getId().equals(id));
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) p.setCantidad(nuevaCantidad);
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos)
            if (p.getCategoria() == categoria) p.mostrarInfo();
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getCantidad();
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto p : productos)
            if (p.getCantidad() > mayor.getCantidad()) mayor = p;
        return mayor;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos)
            if (p.getPrecio() >= min && p.getPrecio() <= max) p.mostrarInfo();
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values())
            System.out.println(c + " → " + c.getDescripcion());
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        inv.agregarProducto(new Producto("P1", "Arroz", 1500, 20, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P2", "TV", 250000, 5, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P3", "Remera", 6000, 30, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P4", "Sillón", 180000, 2, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P5", "Gaseosa", 1200, 50, CategoriaProducto.ALIMENTOS));

        System.out.println("Listado general:");
        inv.listarProductos();

        System.out.println("\nProducto con mayor stock:");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();
    }
}
