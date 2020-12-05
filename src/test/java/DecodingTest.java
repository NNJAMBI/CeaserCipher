import org.junit.Test;
import static org.junit.Assert.*;

public class DecodingTest {
    Decoding testDecoding = new Decoding( 2, "PCPEA MCTCPLC");

    @Test
    public void checkIfSavesInputText() {
        assertEquals("PCPEA MCTCPLC", testDecoding.getInputText());
    }

    @Test
    public void checkKeyIsSaved() {
        assertEquals(2, testDecoding.getKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testDecoding.isValidInputText());
    }

    @Test
    public void isValidKey()
    {
        assertEquals(true, testDecoding.isValidKey());
    }

    @Test
    public void validDecoding()
    {
        assertEquals("NANCY KARANJA" , testDecoding.decode());
    }
}
