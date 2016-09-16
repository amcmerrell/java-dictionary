import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @After
  public void tearDown() {
    Definition.clear();
  }

  @Test
  public void constructor_definitionInstantiatesCorrectly_true() {
    Definition testDefinition = new Definition("HTML is a standardized system for tagging text files to achieve font, color, graphic.");
    assertTrue(testDefinition instanceof Definition);
  }

  @Test
  public void getDescription_returnsCorrectDescription_description() {
    Definition testDefinition = new Definition("HTML is a standardized system for tagging text files to achieve font, color, graphic.");
    assertEquals("HTML is a standardized system for tagging text files to achieve font, color, graphic.", testDefinition.getDescription());
  }

  @Test
  public void all_returnsAllInstancesOfDescription_true() {
    Definition definitionOne = new Definition("HTML is a standardized system for tagging text files to achieve font, color, graphic.");
    Definition definitionTwo = new Definition("Hypertext Markup Language");
    assertTrue(Definition.all().contains(definitionOne));
    assertTrue(Definition.all().contains(definitionTwo));
  }

  @Test
  public void clear_emptiesAllInstancsOfDefinition_0() {
    Definition testDefinition = new Definition("HTML is a standardized system for tagging text files to achieve font, color, graphic.");
    Definition.clear();
    assertEquals(0, Definition.all().size());
  }

  @Test
  public void getId_instanceInstantiatesWithAnId_1() {
    Definition testDefinition = new Definition("HTML is a standardized system for tagging text files to achieve font, color, graphic.");
    assertEquals(1, testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_definitionTwo() {
    Definition definitionOne = new Definition("HTML is a standardized system for tagging text files to achieve font, color, graphic.");
    Definition definitionTwo = new Definition("Hypertext Markup Language");
    assertEquals(definitionTwo, Definition.find(definitionTwo.getId()));
  }

}
