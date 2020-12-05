import org.junit.Test;
import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void checkIfItCreatesInstance() {
        Encoding testEncoding = new Encoding("NANCY KARANJA", 2);
        assertEquals(true, testEncoding instanceof Encoding);
    }

    @Test
    public void checkIfSavedInputText() {
        assertEquals("NANCY NJAMBI", testEncoding.getInputText());
    }
}
