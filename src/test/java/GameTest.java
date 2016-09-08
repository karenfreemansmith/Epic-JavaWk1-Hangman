import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void newGame_createsObject_true() {
    Game thisGame = new Game();
    assertEquals(true, thisGame instanceof Game);
  }

  @Test
  public void getWord_String() {
    Game thisGame = new Game();
    assertEquals(true, thisGame.getWord() instanceof String && thisGame.getWord().length()>0);
  }

  @Test
  public void guessLetter_letterExists_true() {
    Game thisGame = new Game();
    assertEquals(true, thisGame.guessLetter("a"));
  }

  @Test
  public void guessLetter_letterNotExists_false() {
    Game thisGame = new Game();
    assertEquals(false, thisGame.guessLetter("z"));
  }

  @Test
  public void findLetter_int() {
    Game thisGame = new Game();
    assertEquals(0, thisGame.findLetter("s"));
  }

  @Test
  public void gameOver_wordsMatch_true() {
    Game thisGame = new Game();
    assertEquals(true, thisGame.gameOver("supercalifragilisticexpialidocious"));
  }

  @Test
  public void gameOver_wordsNotMatch_false() {
    Game thisGame = new Game();
    assertEquals(false, thisGame.gameOver("helloworld"));
  }

  @Test
  public void setWord_String() {
    Game thisGame = new Game();
    thisGame.setWord("hello");
    assertEquals(true, thisGame.getWord().equals("hello"));
  }

  @Test
  public void testReplaceLetter_oneLetter() {
    Game thisGame = new Game();
    thisGame.replaceLetters("s");
    assertEquals(true, thisGame.getWord().equals("-upercalifragili-ticexpialidociou-"));
  }

  // @Test
  // public void newGame_getRandomWord_String() {
  //   Game thisGame = new Game();
  //   Game thatGame = new Game();
  //   assertEquals(false, thisGame.getWord().equals(thatGame.getWord()));
  // }
}
