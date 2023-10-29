
import java.time.LocalDate;

/**
 *
 * @author yeray
 */
public class RegistroUsuarios {

    private static class NodoUsuario {

        private String nombre;
        private String apellidos;
        private String usuario;
        private String password;
        private String estado;
        private Cita cita;
        private NodoUsuario anterior;
        private NodoUsuario siguiente;
        private NodoUsuario cabeza;
        private NodoUsuario fin;

        public NodoUsuario(String nombre, String apellidos, String usuario, String password, String estado, Cita cita) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.usuario = usuario;
            this.password = password;
            this.estado = estado;
            this.cita = cita;
        }
        
        // Constructor que inicializa los atributos de la clase
        public void RegistroUsuarios() {
            this.cabeza = null;
            this.fin = null;
        }

        // Método que agrega un nuevo usuario a la lista.
        public void agregarUsuario(String nombre, String apellidos, String usuario, String password) {
            // Creamos un nuevo nodo `NodoUsuario` con la información proporcionada por el usuario
            NodoUsuario nuevoNodo = new NodoUsuario(nombre, apellidos, usuario, password, "Activo", cita);

            // Verificamos si la lista está vacía
            if (this.cabeza == null) {
                // Si la lista está vacía, el nuevo nodo es el primero y el último.
                this.cabeza = nuevoNodo;
                this.fin = nuevoNodo;

            } else {
                // Si la lista no está vacía, el nuevo nodo se agrega al final.
                NodoUsuario nodoActual = this.cabeza;
                while (nodoActual != null) {
                    if (nodoActual.usuario.equals(usuario)) {
                        throw new RuntimeException("El usuario ya existe.");
                    }
                    nodoActual = nodoActual.siguiente;
                }

                this.fin.siguiente = nuevoNodo;
                nuevoNodo.anterior = this.fin;
                this.fin = nuevoNodo;
            }

        }

        // Método que inactiva un usuario de la lista
        public void inactivarUsuario(String usuario) {
            // Busca el nodo del usuario en la lista
            NodoUsuario nodoActual = this.cabeza;
            while (nodoActual != null) {
                if (nodoActual.usuario.equals(usuario)) {
                    // Verifica si el usuario tiene citas en el mes actual
                    if (tieneCitasEnElMesActual(usuario, LocalDate.now().withDayOfMonth(1), LocalDate.now().withDayOfMonth(LocalDate.now().lengthOfMonth()))) {
                        throw new RuntimeException("El usuario tiene citas en el mes actual. No se puede inactivar.");
                    }

                    // Inactiva el usuario
                    nodoActual.estado = "Inactivo";
                    return;
                }
                nodoActual = nodoActual.siguiente;
            }
            
            // Si el usuario no existe en la lista, se lanza una excepción
            throw new RuntimeException("El usuario no existe.");
        }
        
        // Método privado que verifica si un usuario tiene citas en el mes actual
        private boolean tieneCitasEnElMesActual(String usuario, LocalDate fechaInicioMes, LocalDate fechaFinMes) {
            // Obtiene el primer nodo de la lista de citas del usuario.
            NodoUsuario nodoUsuarioActual = this.cabeza;

            // Verifica si el usuario tiene citas en el mes actual.
            while (nodoUsuarioActual != null) {
                if (nodoUsuarioActual.cita.getFecha().isAfter(fechaInicioMes) && nodoUsuarioActual.cita.getFecha().isBefore(fechaFinMes)) {
                    return true;
                }
                nodoUsuarioActual = nodoUsuarioActual.siguiente;
            }
            
            // Si el usuario no tiene citas en el mes actual, se devuelve `false`.
            return false;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public NodoUsuario getAnterior() {
            return anterior;
        }

        public void setAnterior(NodoUsuario anterior) {
            this.anterior = anterior;
        }

        public NodoUsuario getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(NodoUsuario siguiente) {
            this.siguiente = siguiente;
        }

        public Cita getCita() {
            return cita;
        }

        public void setCita(Cita cita) {
            this.cita = cita;
        }

    }

}
