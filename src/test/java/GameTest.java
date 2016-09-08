import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void newGame_createsObject_true() {
    Game thisGame = new Game();
    assertEquals(true, thisGame instanceof Game);
  }
}
