package Assignment4;

import java.util.Scanner;

import Assignment4.services.management;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to write file? (y/n): ");
        String writeans = sc.nextLine();
        boolean checkWrite = false;
        String path = "";
        if (writeans.equalsIgnoreCase("y")) {
            System.out.println("=============File Writer=============");
            System.out.print("Please insert path: ");
            path = sc.nextLine();
            System.out.println("Please insert content:");
            String content = sc.nextLine();
            management mnm = new management();
            checkWrite = mnm.fileWriter(path, content);
            if (checkWrite) {
                System.out.println("Write to file successful");

            } else {
                System.out.println("Write to file failed");
            }
        }
        System.out.print("Do you want to read file? (y/n): ");
        String readans = sc.nextLine();
        if (readans.equalsIgnoreCase("y")) {
            if (!checkWrite) {
                System.out.println("=============File Reader=============");
                System.out.print("Please input path: ");
                path = sc.nextLine();
            }
            management mnm = new management();
            System.out.println(mnm.fileReader(path));
        }

        sc.close();

    }
}
