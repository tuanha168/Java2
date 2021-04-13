package StudenApp.views;

import java.util.Scanner;

import StudenApp.entities.Student;
import StudenApp.services.StudentManagement;

public class Main {
  public static void main(String[] args) {
    StudentManagement management = new StudentManagement();
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("1. List all students");
      System.out.println("2. Add new student");
      System.out.println("3. Save to file");
      System.out.println("4. Read data from file");
      System.out.println("0. Exit");

      System.out.print("Input your choice: ");
      int choice = Integer.parseInt(sc.nextLine());

      switch (choice) {

      case 1:
        var students = management.getStudents();
        for (var student : students) {
          System.out.println(student.toString());
        }
        break;
      case 2:
        System.out.println("\nAdd new Student");
        System.out.print("Input id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input email: ");
        String email = sc.nextLine();

        management.addStudent(new Student(id, name, email));
        break;
      case 3:
        management.saveToFile();
        break;
      case 4:
        try {
          management.readFile();
          var students1 = management.getStudents();
          for (var student : students1) {
            System.out.println(student.toString());
          }
        } catch (Exception e) {

        }
        break;
      case 0:
        System.exit(0);
        break;
      }
    }
  }
}