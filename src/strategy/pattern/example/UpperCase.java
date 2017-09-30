package strategy.pattern.example;

public class UpperCase implements Strategy {

  @Override
  public String changeCase(String text) {
    String changedText = text.toUpperCase();
    return changedText;
  }

}