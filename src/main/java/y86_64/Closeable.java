package y86_64;

import java.io.IOException;

public interface Closeable {

    void stop() throws IOException;

}
