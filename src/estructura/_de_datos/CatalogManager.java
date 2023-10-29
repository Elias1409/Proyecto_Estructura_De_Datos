/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sodahappyeatsapp;

/**
 *
 * @author elias
 */
public class CatalogManager {
    private Categoria[] categorias;
    private Producto[] productos;
    private Cliente[] clientes;
    private Proveedor[] proveedores;
    private int categoriaCount;
    private int productoCount;
    private int clienteCount;
    private int proveedorCount;

    public CatalogManager(int maxCategorias, int maxProductos, int maxClientes, int maxProveedores) {
        categorias = new Categoria[maxCategorias];
        productos = new Producto[maxProductos];
        clientes = new Cliente[maxClientes];
        proveedores = new Proveedor[maxProveedores];
        categoriaCount = 0;
        productoCount = 0;
        clienteCount = 0;
        proveedorCount = 0;
    }

    public void agregarCategoria(Categoria categoria) {
        if (categoriaCount < categorias.length) {
            categorias[categoriaCount] = categoria;
            categoriaCount++;
        } else {
            // Manejar el caso en el que el arreglo de categorías está lleno
        }
    }

    public void editarCategoria(int codigo, String nuevoNombre, String nuevaDescripcion) {
        for (int i = 0; i < categoriaCount; i++) {
            if (categorias[i].getCodigo() == codigo) {
                categorias[i].setNombre(nuevoNombre);
                categorias[i].setDescripcion(nuevaDescripcion);
            }
        }
    }

    public void inactivarCategoria(int codigo) {
        for (int i = 0; i < categoriaCount; i++) {
            if (categorias[i].getCodigo() == codigo) {
                categorias[i].setActiva(false);
            }
        }
    }

    public void agregarProducto(Producto producto) {
        if (productoCount < productos.length) {
            productos[productoCount] = producto;
            productoCount++;
        } else {
            // Manejar el caso en el que el arreglo de productos está lleno
        }
    }

    public void editarProducto(int codigo, String nuevoNombre, String nuevaDescripcion, double nuevoPrecio) {
        for (int i = 0; i < productoCount; i++) {
            if (productos[i].getCodigo() == codigo) {
                productos[i].setNombre(nuevoNombre);
                productos[i].setDescripcion(nuevaDescripcion);
                productos[i].setPrecio(nuevoPrecio);
            }
        }
    }

    public void inactivarProducto(int codigo) {
        for (int i = 0; i < productoCount; i++) {
            if (productos[i].getCodigo() == codigo) {
                productos[i].setActivo(false);
            }
        }
    }

    public void agregarCliente(Cliente cliente) {
        if (clienteCount < clientes.length) {
            clientes[clienteCount] = cliente;
            clienteCount++;
        } else {
            // Manejar el caso en el que el arreglo de clientes está lleno
        }
    }

    public void editarCliente(int id, String nuevoNombre, String nuevoApellido, String nuevaDireccion) {
        for (int i = 0; i < clienteCount; i++) {
            if (clientes[i].getId() == id) {
                clientes[i].setNombre(nuevoNombre);
                clientes[i].setApellido(nuevoApellido);
                clientes[i].setDireccion(nuevaDireccion);
            }
        }
    }

    public void inactivarCliente(int id) {
        for (int i = 0; i < clienteCount; i++) {
            if (clientes[i].getId() == id) {
                clientes[i].setActivo(false);
            }
        }
    }

    public void agregarProveedor(Proveedor proveedor) {
        if (proveedorCount < proveedores.length) {
            proveedores[proveedorCount] = proveedor;
            proveedorCount++;
        } else {
            // Manejar el caso en el que el arreglo de proveedores está lleno
        }
    }

    public void editarProveedor(int id, String nuevoNombre, String nuevaDireccion, String nuevoNumeroContacto) {
        for (int i = 0; i < proveedorCount; i++) {
            if (proveedores[i].getId() == id) {
                proveedores[i].setNombre(nuevoNombre);
                proveedores[i].setDireccion(nuevaDireccion);
                proveedores[i].setNumeroContacto(nuevoNumeroContacto);
            }
        }
    }

    public void inactivarProveedor(int id) {
        for (int i = 0; i < proveedorCount; i++) {
            if (proveedores[i].getId() == id) {
                proveedores[i].setActivo(false);
            }
        }
    }

    public Categoria[] getCategorias() {
        return categorias;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Proveedor[] getProveedores() {
        return proveedores;
    }
}