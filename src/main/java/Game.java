public class Game {
  private String mWord = "supercalifragilisticexpialidocious";

  public String getWord() {
    return mWord;
  }

  public boolean guessLetter(String letter) {
    return mWord.contains(letter);
  }

  public int findLetter(String letter) {
    return mWord.indexOf(letter);
  }


}
