package plandeahorro;

public class Factory {
    public static GrabadorUsuario obtenerGrabadorUsuario() {
        return new GrabadorUsuarioSQL();
    }
}
