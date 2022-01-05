package exception;

public class BathDBException extends BathException {

    public BathDBException(Throwable e, String message, String code) {
        super(e, message, code);
    }
    public BathDBException(String message, String code) {
        super(message, code);
    }

}
