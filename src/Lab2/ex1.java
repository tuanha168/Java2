package Lab2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int a, b;
        boolean check = false;
        Scanner input = new Scanner(System.in);
        while (!check) {
            try {
                System.out.print("input a: ");
                a = Integer.parseInt(input.nextLine());
                check = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        check = false;
        while (!check) {
            try {
                System.out.print("input b: ");
                b = Integer.parseInt(input.nextLine());
                check = true;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}