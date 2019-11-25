package y86_64.exceptions;

public class MemoryException extends ComponentException {
    public MemoryException() {
        super();
    }

    public MemoryException(String message) {
        super(message);
    }

    public MemoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemoryException(Throwable cause) {
        super(cause);
    }

    protected MemoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
