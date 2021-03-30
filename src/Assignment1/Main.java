package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PersonManagement management = new PersonManagement();
        Scanner sc = new Scanner(System.in);

        // System.out.print("Please input name: ");
        // String name = sc.nextLine();
        //
        // System.out.print("Please input address: ");
        // String address = sc.nextLine();
        //
        // System.out.print("Please input salary: ");
        // String sSalary = sc.nextLine();
        //
        // try
        // {
        // Person person=management.inputPersonInfo(name,address,sSalary);
        // }catch (Exception e){
        // System.out.println(e.getMessage());
        // }
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "London", 1200));
        persons.add(new Person("Marry", "Paris", 1000));
        persons.add(new Person("Obama", "Singapore", 2000));
        try {
            var p = management.sortBySalary(persons);
            for (var per : p) {
                System.out.println(per.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSap xep theo ten");
        var personsByName = management.sortByName(persons);
        for (var per : personsByName) {
            System.out.println(per.toString());
        }
    }
}
