package y86_64.exceptions;

public class MemoryNotInitializedException extends MemoryException {
    public MemoryNotInitializedException() {
        super();
    }

    public MemoryNotInitializedException(String message) {
        super(message);
    }

    public MemoryNotInitializedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemoryNotInitializedException(Throwable cause) {
        super(cause);
    }

    protected MemoryNotInitializedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
