import org.junit.Test;
import static org.junit.Assert.*;

public class DecodingTest {
    Decoding testDecoding = new Decoding( 2, "PCPEA MCTCPLC");

    @Test
    public void checkIfSavesInputText() {
        assertArrayEquals("PCPEA MCTCPLC", testDecoding.getInputText());
    }
}
