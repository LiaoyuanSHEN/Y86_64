package y86_64.exceptions;

public class MemoryOutOfBoundException extends MemoryException {
    public MemoryOutOfBoundException() {
        super();
    }

    public MemoryOutOfBoundException(String message) {
        super(message);
    }

    public MemoryOutOfBoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemoryOutOfBoundException(Throwable cause) {
        super(cause);
    }

    protected MemoryOutOfBoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
