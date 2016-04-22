import java.util.ArrayList;
import java.util.HashMap;

public class VowelPuzzle {

  public String makePuzzle(String userInput) {
    HashMap<String, String> puzzleLetter = new HashMap<String, String>();
    puzzleLetter.put("a", "-");
    return puzzleLetter.get(userInput);
  }
}
