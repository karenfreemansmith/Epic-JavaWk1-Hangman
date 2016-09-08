public class Game {
  private String mWord = "supercalifragilisticexpialidocious";

  public String getWord() {
    return mWord;
  }

  public void setWord(String str) {

  }

  public boolean guessLetter(String letter) {
    return mWord.contains(letter);
  }

  public int findLetter(String letter) {
    return mWord.indexOf(letter);
  }

  public boolean gameOver(String guess) {
    return mWord.equals(guess);
  }


}
