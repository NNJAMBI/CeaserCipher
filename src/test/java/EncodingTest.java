import org.junit.Test;
import static org.junit.Assert.*;

public class EncodingTest {
    Encoding testEncoding = new Encoding("NANCY KARANJA", 2);
    @Test
    public void checkIfItCreatesInstance() {
        //Encoding testEncoding = new Encoding("NANCY KARANJA", 2);
        assertEquals(true, testEncoding instanceof Encoding);

    }
    @Test
    public void checkIfSavedInputText() {
        //Encoding testEncoding = new Encoding("NANCY KARANJA", 2);
        assertEquals("NANCY KARANJA", testEncoding.getInputText());
    }

    @Test
    public void checkIfKeyIsSaved() {
        assertEquals(2, testEncoding.getKey());
    }
}


