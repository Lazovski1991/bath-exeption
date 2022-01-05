package exception;

public class BathAuthException extends BathException {
    public BathAuthException(Exception e, String message, String code) {
        super(e, message, code);
    }
    public BathAuthException(String message, String code) {
        super(message, code);
    }
}
