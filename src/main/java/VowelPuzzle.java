import java.util.ArrayList;
import java.util.HashMap;

public class VowelPuzzle {

  public String makePuzzle(String userInput) {
    userInput = userInput.replaceAll("a", "-");
    return userInput;
  }
}
