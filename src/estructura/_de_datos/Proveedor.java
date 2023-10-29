/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sodahappyeatsapp;

/**
 *
 * @author elias
 */
public class Proveedor {
    private int id;
    private String nombre;
    private String direccion; 
    private String numeroContacto;
    private boolean activo;

    public Proveedor(int id, String nombre, String direccion, String numeroContacto) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroContacto = numeroContacto;
        this.activo = true; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    

   
    
}

