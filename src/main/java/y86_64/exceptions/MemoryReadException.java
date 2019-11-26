package y86_64.exceptions;

public class MemoryReadException extends MemoryException {
    public MemoryReadException() {
        super();
    }

    public MemoryReadException(String message) {
        super(message);
    }

    public MemoryReadException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemoryReadException(Throwable cause) {
        super(cause);
    }

    protected MemoryReadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
