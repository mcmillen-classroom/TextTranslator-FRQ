import java.util.ArrayList;

public class TextTranslator {

  private ArrayList<TextSlang> slangDictionary = new ArrayList<TextSlang>() {{
    add(new TextSlang("ttyl", "talk to you later"));
    add(new TextSlang("kkthxbai", "thank you"));
    // TODO: add more entries to test your solution
  }};

  public String convertTerm(String term) {
   
    // TODO: part a implementation

    return term;
  }

  public String expandText(String withSlang) {

    // TODO: part b implementation

    return withSlang;
  }
}