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

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word wordOne = new Word("Java");
    Word wordTwo = new Word("HTML");
    assertTrue(Word.all().contains(wordOne));
    assertTrue(Word.all().contains(wordTwo));
  }

  @Test
  public void clear_emptiesAllInstancesOfWord_0() {
    Word testWord = new Word("Java");
    Word.clear();
  }

  @Test
  public void getId_wordInstantiatesWithAnId_1() {
    Word testWord = new Word("Java");
    assertEquals(1, testWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId_wordTwo() {
    Word wordOne = new Word("Java");
    Word wordTwo = new Word("HTML");
    assertEquals(wordTwo, Word.find(wordTwo.getId()));
  }
}
