package service;

import model.Contador;
import exception.ContadorException;

public class ContadorService {
    private Contador contador;

    public ContadorService() {
        this.contador = new Contador();
    }

    public void incrementarVariasVezes(int vezes) {
        if (vezes < 0) {
            throw new ContadorException("Não é possível incrementar um número negativo de vezes!");
        }

        for (int i = 0; i < vezes; i++) {
            contador.incrementar();
        }
    }

    public void decrementarVariasVezes(int vezes) {
        if (vezes < 0) {
            throw new ContadorException("Não é possível decrementar um número negativo de vezes!");
        }

        for (int i = 0; i < vezes; i++) {
            contador.decrementar();
        }
    }

    public int getValorAtual() {
        return contador.getValor();
    }

    public void zerarContador() {
        contador.zerar();
    }
}
