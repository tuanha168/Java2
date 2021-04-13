package Assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("===== Analysis Path Program =====");
        do {
            String PathProgram = "[A-Z][:]\\\\\\w+(\\\\\\w+[.]\\w+)?";
            System.out.print("Please input Path: ");
            input = sc.next();
            flag = input.matches(PathProgram);
            if (!flag)
                System.out.println("duong dan khong hop le!");
        } while (!flag);
        System.out.println("duong dan hop le");
        MyFileName fileName = new MyFileName(input);
        System.out.println("----- Result Analysis -----");
        System.out.println("Disk: " + fileName.getDisk());
        System.out.println("Extension: " + fileName.getExtension());
        System.out.println("file Name: " + fileName.getFileName());
        System.out.println("path: " + fileName.getPath());
        for (var folder : fileName.getFolders()) {
            System.out.println("Folders: " + folder);
        }
        sc.close();
    }
}
