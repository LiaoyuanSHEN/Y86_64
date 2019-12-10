package y86_64.util;

public class TranslateUtil {

    private static final long BYTE_MASK = 0B0_1111_1111;

    private TranslateUtil() {
    }

    public static byte[] toLongByteArray(long value) {
        byte[] arr = new byte[8];
        arr[0] = (byte) (value >> 56);
        arr[1] = (byte) (value >> 48 & BYTE_MASK);
        arr[2] = (byte) (value >> 40 & BYTE_MASK);
        arr[3] = (byte) (value >> 32 & BYTE_MASK);
        arr[4] = (byte) (value >> 24 & BYTE_MASK);
        arr[5] = (byte) (value >> 16 & BYTE_MASK);
        arr[6] = (byte) (value >> 8 & BYTE_MASK);
        arr[7] = (byte) (value & BYTE_MASK);
        return arr;
    }

    public static long fromLongByteArray(byte[] arr) {
        return (BYTE_MASK & arr[0]) << 56 |
                (BYTE_MASK & arr[1]) << 48 |
                (BYTE_MASK & arr[2]) << 40 |
                (BYTE_MASK & arr[3]) << 32 |
                (BYTE_MASK & arr[4]) << 24 |
                (BYTE_MASK & arr[5]) << 16 |
                (BYTE_MASK & arr[6]) << 8 |
                (BYTE_MASK & arr[7]);
    }
}
