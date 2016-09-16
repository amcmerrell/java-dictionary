import java.util.ArrayList;
import java.util.List;

public class Definition {
  private String mDescription;
  private static List<Definition> instances= new ArrayList<Definition>();

  public Definition(String description) {
    mDescription = description;
    instances.add(this);
  }

  public String getDescription() {
    return mDescription;
  }

  public static List<Definition> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
