package y86_64.exceptions;

public class CpuInterruptException extends CpuException {
    public CpuInterruptException() {
        super();
    }

    public CpuInterruptException(String message) {
        super(message);
    }

    public CpuInterruptException(String message, Throwable cause) {
        super(message, cause);
    }

    public CpuInterruptException(Throwable cause) {
        super(cause);
    }

    protected CpuInterruptException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
