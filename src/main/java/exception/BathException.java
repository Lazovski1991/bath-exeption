package exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BathException extends RuntimeException {
    private String code;

    public BathException(String message) {
        super(message);
    }

    public BathException(Throwable e, String message) {
        super(message, e);
    }

    public BathException(Throwable e, String message, String code) {
        super(message, e);
        this.code = code;
    }

    public BathException(String message, String code) {
        super(message);
        this.code = code;
    }
}
