package Assignment5;

import java.io.FileOutputStream;
import java.io.IOException;

public class demoOutput {
  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("text.txt");) {
      String text = "heelo";
      fos.write(text.getBytes());
      System.out.println("Ghi file thanh cong");
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
