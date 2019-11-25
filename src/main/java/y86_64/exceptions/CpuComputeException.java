package y86_64.exceptions;

public class CpuComputeException extends CpuException {
    public CpuComputeException() {
        super();
    }

    public CpuComputeException(String message) {
        super(message);
    }

    public CpuComputeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CpuComputeException(Throwable cause) {
        super(cause);
    }

    protected CpuComputeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
