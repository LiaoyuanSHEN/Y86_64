package y86_64;

import y86_64.exceptions.MemoryException;

public interface Memory extends Component {

    byte readByte(long address) throws MemoryException;

    void writeByte(long address, byte value) throws MemoryException;

}
