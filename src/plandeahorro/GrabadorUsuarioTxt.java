package plandeahorro;

public class GrabadorUsuarioTxt implements GrabadorUsuario {

    @Override
    public void grabar(UsuarioDTO usuario) {
        System.out.println(usuario);
        System.out.println("soporte txt");
    }
    
}
