package plandeahorro;

public class GrabadorUsuarioSQL implements GrabadorUsuario {
    public void grabar(UsuarioDTO usuario) {
        System.out.println(usuario);
        System.out.println("Soporte SQL");
    }
}
