public class TextSlang {

  private String term;
  private String definition;

  public TextSlang(String t, String d) {
    term = t;
    definition = d;
  }

  public String getSlang() {
    return term;
  }

  public String getDefinition() {
    return definition;
  }
}