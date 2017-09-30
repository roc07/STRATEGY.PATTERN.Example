package strategy.pattern.example;

public class LowerCase implements Strategy {

  @Override
  public String changeCase(String text) {
    String changedText = text.toLowerCase();
    return changedText;
  }

}
