package interfazgraficausuario;

import java.util.function.Consumer;

public class Incrementador {
    public Incrementador() {
        estadoActual = 0;
        notificable = z -> {};
        notificable2 = z -> {};
    }
    public void incrementar() {
        estadoActual++;
        notificable.notificar(estadoActual);
        notificable2.accept(estadoActual);
    }
    public void setNotificable1(Notificable n) {
        notificable = n;
    }
    public void setNotificable2(Consumer<Integer> n) {
        notificable2 = n;
    }
    private Notificable notificable; 
    private Consumer<Integer> notificable2;
    private int estadoActual;
}
