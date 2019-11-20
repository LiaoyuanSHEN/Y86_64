package y86_64.exceptions;

public class Y86_64Exception extends Exception {

    public Y86_64Exception() {
        super();
    }

    public Y86_64Exception(String message) {
        super(message);
    }

    public Y86_64Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Y86_64Exception(Throwable cause) {
        super(cause);
    }

    protected Y86_64Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
