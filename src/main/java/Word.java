import java.util.ArrayList;
import java.util.List;

public class Word {
  private String mName;
  private static List<Word> instances = new ArrayList<Word>();

  public Word (String name) {
    mName = name;
    instances.add(this);
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

}
