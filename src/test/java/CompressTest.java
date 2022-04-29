import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompressTest {
    @Test
    public void successfulCompress() {
        String compressed = Main.compress("aabcccccaaa");

        String expectedResult = "a2b1c5a3";

        Assertions.assertEquals(expectedResult, compressed);
    }

    @Test
    public void compressedTooLong() {
        String compressed = Main.compress("ababababababababa");

        String expectedResult = "ababababababababa";

        Assertions.assertEquals(expectedResult, compressed);
    }
}