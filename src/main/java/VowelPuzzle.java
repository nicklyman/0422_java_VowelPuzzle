

public class VowelPuzzle {

  public String makePuzzle(String userInput) {
    userInput = userInput.replaceAll("[aAeEiIoOuU]", "-");
    return userInput;
  }
}
