import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    Game hangman = new Game();
    String letter = "";
    String outputString = "";
    List<String> userGuesses = new ArrayList<String>();
    List<String> computerWord = new ArrayList<String>();
    hangman.getWord();

    for(int i=0; i<hangman.getWord().length(); i++) {
      computerWord.add(Character.toString(hangman.getWord().charAt(i)));
      userGuesses.add("-");
    }

    while (!String.join("", computerWord).equals(outputString)) {
      letter = c.readLine("Guess a letter to find out the secret word! ");
      if (hangman.guessLetter(letter)) {
        for(int i=0; i<userGuesses.size(); i++) {
          if(computerWord.get(i).equals(letter)) {
            userGuesses.set(i,letter);
          }
        }
        outputString = String.join("", userGuesses);
        hangman.replaceLetters(letter);
        System.out.println(outputString);
      } else {
        System.out.println("Sorry, that is not the right letter.");
      }
    }
    System.out.println("You guessed it!!!");
  }
}
