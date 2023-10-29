package estructura._de_datos;

import java.util.Date;
import java.util.LinkedList;

public class TransaccionesModule {
 private LinkedList<Transaccion> transacciones;

    public TransaccionesModule() {
        transacciones = new LinkedList<>();
    }

    // Método para agregar una transacción
    public void agregarTransaccion(String nombreCliente, double monto) {
        Transaccion transaccion = new Transaccion(new Date(), nombreCliente, monto);
        transacciones.add(transaccion);
    }

    // Método para mostrar todas las transacciones
    public void mostrarTransacciones() {
        for (Transaccion transaccion : transacciones) {
            System.out.println("Fecha y Hora: " + transaccion.getFechaHora());
            System.out.println("Cliente: " + transaccion.getNombreCliente());
            System.out.println("Monto a Pagar: $" + transaccion.getMonto());
            System.out.println("--------------------------");
        }
    }

    // Clase para representar una transacción
    private class Transaccion {
        private Date fechaHora;
        private String nombreCliente;
        private double monto;

        public Transaccion(Date fechaHora, String nombreCliente, double monto) {
            this.fechaHora = fechaHora;
            this.nombreCliente = nombreCliente;
            this.monto = monto;
        }

        public Date getFechaHora() {
            return fechaHora;
        }

        public String getNombreCliente() {
            return nombreCliente;
        }

        public double getMonto() {
            return monto;
        }
    }
}

   
