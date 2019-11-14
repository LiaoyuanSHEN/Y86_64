package y86_64;

public interface Memory {

    void init(int component);

    long read(long address);

    void write(long address, long value);

}
