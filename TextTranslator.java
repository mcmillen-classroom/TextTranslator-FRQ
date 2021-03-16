import java.util.ArrayList;

public class TextTranslator {

  private ArrayList<TextSlang> slangDictionary = new ArrayList<TextSlang>() {{
    add(new TextSlang("ttyl", "talk to you later"));
    add(new TextSlang("kkthxbai", "thank you"));
    // TODO: add more entries to test your solution
  }};

  public String convertTerm(String term) {
    for (TextSlang slang : slangDictionary) {
      if (slang.getSlang().equals(term)) {
        return slang.getDefinition();
      }
    }

    return term;
  }

  public String expandText(String withSlang) {

    String expanded = withSlang;

    // Unbounded compexity is possible with recursive definitions.
    // Probably not the point of this problem.

    for (TextSlang slang : slangDictionary) {
      expanded = expanded.replaceAll(slang.getSlang(), slang.getDefinition());
    }

    return expanded;
  }
}