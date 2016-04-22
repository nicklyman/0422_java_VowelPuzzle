import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;

public class VowelPuzzleTest {

  @Test
  public void makePuzzle_returnsDashForVowel_dash() {
    VowelPuzzle testLetters = new VowelPuzzle();
    String expected = "-";
    assertEquals(expected, testLetters.makePuzzle("a"));
  }
}
