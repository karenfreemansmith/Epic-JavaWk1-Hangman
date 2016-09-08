import java.util.List;
import java.util.ArrayList;

public class Game {
  private String mWord = "supercalifragilisticexpialidocious";

  public String getWord() {
    return mWord;
  }

  public void setWord(String str) {
    mWord = str;
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

  public void replaceLetters(String letter) {
    List<String> newWord = new ArrayList<String>();

    for(int i=0; i<mWord.length(); i++) {
      if(Character.toString(mWord.charAt(i)).equals(letter)) {
        newWord.add("-");
      } else {
        newWord.add(Character.toString(mWord.charAt(i)));
      }
    }
    mWord = String.join("", newWord);
  }

}
