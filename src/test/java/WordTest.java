import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @After
  public void tearDown() {
    Word.clear();
    Definition.clear();
  }

  @Test
  public void compiler_wordInstantiatesCorrectly_true() {
    Word testWord = new Word("Java");
    assertTrue(testWord instanceof Word);
  }

  @Test
  public void getTerm_returnsCorrectTerm_Java() {
    Word testWord = new Word("Java");
    assertEquals("Java", testWord.getTerm());
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

  @Test
  public void getDefinitions_initiallyReturnsEmptyList_ArrayList() {
    Word testWord = new Word("HTML");
    assertEquals(0, testWord.getDefinitions().size());
  }

  @Test
  public void addDefinitions_addsDefinitionToWord_true() {
    Word testWord = new Word("HTML");
    Definition testDefinition = new Definition("HTML is a standardized system for tagging text files to achieve font, color, graphic.");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }
}
