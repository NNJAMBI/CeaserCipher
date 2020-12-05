import org.junit.Test;
import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void checkIfItCreatesInstance() {
        Encoding testEncoding = new Encoding();
        assertEquals(true, testEncoding instanceof Encoding);
    }
}
