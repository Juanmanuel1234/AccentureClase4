package plandeahorro;

public class UsuarioDTO {
    public UsuarioDTO(String ID, String nombre, String apellido) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return "UsuarioDTO{" + "ID=" + ID + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }    
    public final String ID;
    public final String nombre;
    public final String apellido;
}
