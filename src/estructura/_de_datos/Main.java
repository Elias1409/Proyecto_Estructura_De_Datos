/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sodahappyeatsapp;

/**
 *
 * @author elias
 */


import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        CatalogManager catalogManager = new CatalogManager(100, 100, 100, 100); // Especifica el tamaño máximo de cada catálogo

        Categoria categoriaBebidas = new Categoria(1, "fresco", "frestuqi");
        Categoria categoriaComida = new Categoria(2, "Comida", "rapidaaa");

        Producto productoRefresco = new Producto(101, "Refresco de Cola", "Bebida refrescante", 2.5, categoriaBebidas);
        Producto productoHamburguesa = new Producto(102, "Hamburguesa Clásica", "burger", 5.99, categoriaComida);

        Cliente cliente1 = new Cliente(1001, "Juan", "Pérez", "123 Main St.");
        Cliente cliente2 = new Cliente(1002, "Maria", "González", "456 Elm St.");

        Proveedor proveedorRefrescos = new Proveedor(2001, "Refrescos Inc.", "789 Supplier St.", "123-456-7890");

        catalogManager.agregarCategoria(categoriaBebidas);
        catalogManager.agregarCategoria(categoriaComida);
        catalogManager.agregarProducto(productoRefresco);
        catalogManager.agregarProducto(productoHamburguesa);
        catalogManager.agregarCliente(cliente1);
        catalogManager.agregarCliente(cliente2);
        catalogManager.agregarProveedor(proveedorRefrescos);

      
catalogManager.editarCategoria(1, "Bebidas Gaseosas", "Refrescos carbonatados");
catalogManager.inactivarCategoria(2);


StringBuilder productosInfo = new StringBuilder("Información de Productos:\n");
for (Producto producto : catalogManager.getProductos()) {
    if (producto != null) {
        productosInfo.append("Código: ").append(producto.getCodigo()).append(", Nombre: ").append(producto.getNombre()).append("\n");
       
    }
}

StringBuilder clientesInfo = new StringBuilder("Información de Clientes:\n");
for (Cliente cliente : catalogManager.getClientes()) {
    if (cliente != null) {
        clientesInfo.append("ID: ").append(cliente.getId()).append(", Nombre: ").append(cliente.getNombre()).append("\n");
        
    }
}

StringBuilder proveedoresInfo = new StringBuilder("Información de Proveedores:\n");
for (Proveedor proveedor : catalogManager.getProveedores()) {
    if (proveedor != null) {
        proveedoresInfo.append("ID: ").append(proveedor.getId()).append(", Nombre: ").append(proveedor.getNombre()).append("\n");
       
    }
}

if (productosInfo.length() > 0 || clientesInfo.length() > 0 || proveedoresInfo.length() > 0) {
    JOptionPane.showMessageDialog(null, productosInfo.toString() + clientesInfo.toString() + proveedoresInfo.toString());
} else {
    JOptionPane.showMessageDialog(null, "No se encontró información de productos, clientes o proveedores.");
}
    }}
