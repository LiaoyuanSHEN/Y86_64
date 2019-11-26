package y86_64.exceptions;

public class MemoryWriteException extends MemoryException {
    public MemoryWriteException() {
        super();
    }

    public MemoryWriteException(String message) {
        super(message);
    }

    public MemoryWriteException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemoryWriteException(Throwable cause) {
        super(cause);
    }

    protected MemoryWriteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
