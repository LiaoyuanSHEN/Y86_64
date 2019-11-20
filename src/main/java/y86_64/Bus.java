package y86_64;

public interface Bus {

    void registerMemory(Memory memory);

    void registerCPU(CPU cpu);

    Memory getMemory();

    CPU getCPU();

    void stop();

}
