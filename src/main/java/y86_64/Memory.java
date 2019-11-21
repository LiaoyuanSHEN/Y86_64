package y86_64;

import y86_64.exceptions.MemoryException;

public interface Memory extends Component {

    void init(long component) throws MemoryException;

    long read(long address) throws MemoryException;

    void write(long address, long value) throws MemoryException;

}
