package Assignment5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadCharacterStream {
  public static void main(String[] args) {
    try (FileWriter fileWriter = new FileWriter("employee.txt")) {
      fileWriter.write("haha hihi hoho");
      System.out.println("ghi thanh cong");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    try (FileReader fileReader = new FileReader("employee.txt")) {
      int ch;
      while ((ch = fileReader.read()) != -1) {
        System.out.print((char) ch);
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
