package y86_64;

import y86_64.exceptions.ComponentException;

public interface Component extends Closeable {

    void init(long component) throws ComponentException;

}
