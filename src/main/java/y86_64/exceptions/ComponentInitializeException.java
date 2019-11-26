package y86_64.exceptions;

public class ComponentInitializeException extends ComponentException {
    public ComponentInitializeException() {
        super();
    }

    public ComponentInitializeException(String message) {
        super(message);
    }

    public ComponentInitializeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ComponentInitializeException(Throwable cause) {
        super(cause);
    }

    protected ComponentInitializeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
