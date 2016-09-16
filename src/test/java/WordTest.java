import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  @Test
  public void compiler_wordInstantiatesCorrectly_true() {
    Word testWord = new Word("Java");
    assertTrue(testWord instanceof Word);
  }

  @Test
  public void getName_returnsCorrectName_Java() {
    Word testWord = new Word("Java");
    assertEquals("Java", testWord.getName());
  }
}
