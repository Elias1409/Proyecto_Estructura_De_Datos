import java.time.LocalDate;
/**
 *
 * @author yeray
 */
public class Cita {

    private LocalDate fecha;
    private String titulo;
    private String descripcion;
    private String usuario;

    public Cita(LocalDate fecha, String titulo, String descripcion, String usuario) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
