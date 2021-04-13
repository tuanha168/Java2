package Assignment5;

import java.util.List;
import java.util.Scanner;

import Assignment5.services.Management;
import Assignment5.services.Person;

/**
 * 
 * @author NghiaNV1
 * @version 1.0
 */
public class Main {
    /**
     * All Option Of Menu
     */
    private final static int PERSON_INFO = 1, COPY_WORD = 2, EXIT = 3;

    /**
     * 
     * @param args default
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Management manage = new Management();
            int choice = 0;
            do {
                System.out.println("========= File Processing =========");
                System.out.println("1. Find person info");
                System.out.println("2. Copy Text to new file");
                System.out.println("3. Exit");
                System.out.print("Please choice one option: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                    case PERSON_INFO:
                        System.out.println("-------- Person info --------");
                        String path;
                        double money = 0;
                        System.out.print("Enter Path: ");
                        path = scanner.nextLine();
                        while (true) {
                            System.out.print("Enter Money: ");
                            try {
                                money = manage.checkInputMoney(scanner.nextLine());
                                break;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        System.out.println("-------- Result --------");
                        List<Person> pesons = null;
                        try {
                            pesons = manage.getPerson(path, money);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                        if (pesons == null) {
                            break;
                        }
                        System.out.printf("%-20s%-20s%-20s%n", "Name", "Address", "Money");
                        for (Person person : pesons) {
                            System.out.printf("%-20s%-20s%-20s%n", person.getName(), person.getAddress(),
                                    person.getMoney());
                        }
                        String maxName = "", minName = "";
                        if (pesons.size() > 0) {
                            maxName = pesons.get(pesons.size() - 1).getName();
                            minName = pesons.get(0).getName();
                        }
                        System.out.printf("Max: %s\n", maxName);
                        System.out.printf("Min: %s\n", minName);
                        break;
                    case COPY_WORD:
                        System.out.println("-------- Copy text --------");
                        String name, source;
                        System.out.print("Enter Source: ");
                        source = scanner.nextLine();
                        System.out.print("Enter new file name: ");
                        name = scanner.nextLine();
                        try {
                            if (manage.copyWordOneTimes(source, name)) {
                                System.out.println("Copy done...");
                            } else {
                                System.out.println("Failure");
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case EXIT:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please choice 1-4");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please choice 1-4");
                }
            } while (choice != EXIT);
        }
    }
}
