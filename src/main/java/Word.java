import java.util.ArrayList;
import java.util.List;

public class Word {
  private String mTerm;
  private static List<Word> instances = new ArrayList<Word>();
  private int mId;

  public Word (String term) {
    mTerm = term;
    instances.add(this);
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

}
