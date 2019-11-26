package y86_64.exceptions;

public class CpuException extends ComponentException {
    public CpuException() {
        super();
    }

    public CpuException(String message) {
        super(message);
    }

    public CpuException(String message, Throwable cause) {
        super(message, cause);
    }

    public CpuException(Throwable cause) {
        super(cause);
    }

    protected CpuException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
