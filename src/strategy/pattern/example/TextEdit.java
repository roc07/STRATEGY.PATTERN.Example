package strategy.pattern.example;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextEdit {
  
  final private Strategy changeCase;
  
  public TextEdit (Strategy changeCase){
    this.changeCase = changeCase;
  }
  
  public String ReceiveAndChangeCaseFromConsole(){
    Scanner read = new Scanner(System.in);
    StringBuilder work = new StringBuilder();

    while (read.hasNextLine()){
      work.append(read.next());   
      System.out.println("__");
    }
   
    return changeCase.changeCase(work.toString());
  }
  
  public String ReceiveAndChangeCaseFromFile(String path){
    StringBuilder work = new StringBuilder();
    FileReader file = null;
    try {
      file = new FileReader(path);
      
      int r;
      while ((r = file.read()) != -1){
        work.append(r);     
      }
    } catch (FileNotFoundException ex) {
      Logger.getLogger(TextEdit.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(TextEdit.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      if (file != null){
        try {
          file.close();
        } catch (IOException ex) {
          Logger.getLogger(TextEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }
    
    return changeCase.changeCase(work.toString());
  }  
  
}
