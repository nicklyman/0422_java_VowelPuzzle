public class VowelPuzzle {

  public String makePuzzle(String userWordInput) {
    userWordInput = userWordInput.replaceAll("[aAeEiIoOuU]", "-");
    return userWordInput;
  }
}
