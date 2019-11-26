package y86_64;

import y86_64.exceptions.CpuException;

public interface CPU extends Component {

    void compute() throws CpuException;

    void interrupt(long code) throws CpuException;

}
