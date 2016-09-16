import java.util.ArrayList;
import java.util.List;

public class Word {
  private String mTerm;
  private static List<Word> instances = new ArrayList<Word>();
  private List<Definition> mDefinitions = new ArrayList<Definition>();
  private int mId;

  public Word (String term) {
    mTerm = term;
    instances.add(this);
    mDefinitions = new ArrayList<Definition>();
    mId = instances.size();
  }

  public String getTerm() {
    return mTerm;
  }

  public static List<Word> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    return instances.get(id - 1);
  }

  public List<Definition> getDefinitions() {
    return mDefinitions;
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

}
