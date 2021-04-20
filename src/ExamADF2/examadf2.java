package ExamADF2;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class examadf2 {
  public static void main(String[] args) throws SQLException {
    Scanner scanner = new Scanner(System.in);
    studentManager sm = new studentManager();
    String choice = "";
    String enrollId;
    String firstName;
    String lastName;
    int age;
    do {
      getMenu();
      System.out.println("Enter your choice:");
      choice = scanner.nextLine();
      switch (choice) {
      case "1":
        enrollId = checkEnrollId(scanner);
        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter Age: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println(sm.addNewStudent(enrollId, firstName, lastName, age));
        break;
      case "2":
        enrollId = checkEnrollId(scanner);
        System.out.println(sm.deleteStudent(enrollId));
        break;
      case "3":
        sm.selectAllStudents();
        break;
      case "4":
        System.exit(0);
        break;
      default:
        System.out.println("Invalid input!");
        break;
      }
    } while (true);
  }

  public static void getMenu() {
    System.out.println("-----Menu-----");
    System.out.println("1. Add new students");
    System.out.println("2. Delete");
    System.out.println("3. Display all student");
    System.out.println("4. Exit");
  }

  public static String checkEnrollId(Scanner scanner) {
    String enrollId;
    System.out.println("Enter Enroll Id:");
    enrollId = scanner.nextLine();

    while (!isValidenrollId(enrollId)) {
      System.out.println("Invalid Enroll Id (Example GC00000)");
      enrollId = scanner.nextLine();
    }
    return enrollId;
  }

  public static boolean isValidenrollId(String enrollId) {
    return Pattern.matches("^(GC)[0-9]{5}$", enrollId);
  }
}
