import java.util.ArrayList;
import java.util.List;

public class Word {
  private String mName;
  private static List<Word> instances = new ArrayList<Word>();
  private int mId;

  public Word (String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mName;
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
