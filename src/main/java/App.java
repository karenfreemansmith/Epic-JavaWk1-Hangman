import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    Game hangman = new Game();
    String outputString = "";
    List<String> userGuesses = new ArrayList<String>();
    List<String> computerWord = new ArrayList<String>();
    hangman.getWord();

    for(int i=0; i<hangman.getWord().length(); i++) {
      computerWord.add(Character.toString(hangman.getWord().charAt(i)));
      userGuesses.add("-");
    }

    String letter = c.readLine("Guess a letter to find out the secret word! ");


    while (!hangman.gameOver(outputString)) {
      if (hangman.guessLetter(letter)) {
        // as long as there is a matching letter fill letter into correct spot
        // use "findLetter" to get index numberuser
        userGuesses.set(hangman.findLetter(letter),letter);
        outputString = String.join("", userGuesses);
        System.out.println(outputString);
        // print out of correct guesses and their location
      } else {
        System.out.println("Sorry, that is not the right letter.");
      }
      letter = c.readLine("Guess a letter to find out the secret word! ");
    }


  }
}
