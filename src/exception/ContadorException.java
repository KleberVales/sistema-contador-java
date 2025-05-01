package exception;

public class ContadorException extends RuntimeException {
    public ContadorException(String mensagem) {
        super(mensagem);
    }
}