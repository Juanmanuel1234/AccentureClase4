package interfazgraficausuario;

public class Incrementador {
    public Incrementador() {
        estadoActual = 0;
    }
    public int incrementar() {
        estadoActual++;
        return estadoActual;
    }
    private int estadoActual;
}
