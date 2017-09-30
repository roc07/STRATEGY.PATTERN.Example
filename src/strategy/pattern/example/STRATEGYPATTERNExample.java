package strategy.pattern.example;

public class STRATEGYPATTERNExample {

  public static void main(String[] args) {
    Strategy testStrategy;
    TextEdit testSubject = new TextEdit(new UpperCase());
    
    System.out.println(testSubject.ReceiveAndChangeCaseFromConsole());
    
  }
  
}
