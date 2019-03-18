package interfazgraficausuario;

public class IncrementadorDe10 extends Incrementador {
    public IncrementadorDe10() {
        estadoActual = 0;
    }
    public int incrementar() {
        estadoActual += 10;
        return estadoActual;
    }
    private int estadoActual;
}
