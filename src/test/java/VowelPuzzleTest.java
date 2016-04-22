import org.junit.*;
import static org.junit.Assert.*;


public class VowelPuzzleTest {

  @Test
  public void makePuzzle_returnsDashForVowel_dash() {
    VowelPuzzle testLetters = new VowelPuzzle();
    String expected = "-";
    assertEquals(expected, testLetters.makePuzzle("a"));
  }
  @Test
  public void makePuzzle_returnsWordWithVowelsAndConsonants_dashesAndConsonants() {
    VowelPuzzle testLetters = new VowelPuzzle();
    String expected = "d-g";
    assertEquals(expected, testLetters.makePuzzle("dog"));
  }
}
