package model;

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void incrementar() {
        if (valor == Integer.MAX_VALUE) {
            throw new IllegalStateException("Contador atingiu o valor máximo!");
        }
        valor++;
    }

    public void decrementar() {
        if (valor == Integer.MIN_VALUE) {
            throw new IllegalStateException("Contador atingiu o valor mínimo!");
        }
        valor--;
    }

    public void zerar() {
        valor = 0;
    }

    public int getValor() {
        return valor;
    }
}
