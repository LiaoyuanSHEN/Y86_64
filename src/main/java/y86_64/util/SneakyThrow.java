package y86_64.util;

public class SneakyThrow {

    private SneakyThrow() {}

    @SuppressWarnings("unchecked")
    public static <T extends Throwable> void sneakyThrow(Throwable t) throws T {
        throw (T) t;
    }

}
