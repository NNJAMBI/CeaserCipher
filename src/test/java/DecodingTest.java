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
}
