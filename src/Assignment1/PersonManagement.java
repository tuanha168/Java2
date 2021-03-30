package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonManagement {
    public Person inputPersonInfo(String name, String address, String sSalary) throws Exception {
        double salary;
        try {
            salary = Double.parseDouble(sSalary);
            if (salary <= 0) {
                throw new Exception("Salary is greater than zero");
            }
        } catch (NullPointerException e) {
            throw new Exception("You must input Salary.");
        } catch (NumberFormatException e) {
            throw new Exception("You must input digit.");
        }

        return new Person(name, address, salary);
    }

    public void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Salary: " + person.getSalary());
    }

    public ArrayList<Person> sortBySalary(ArrayList<Person> persons) throws Exception {
        Collections.sort(persons);

        return persons;
    }

    public ArrayList<Person> sortBySalaryDesc(ArrayList<Person> persons) throws Exception {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return (int) (p1.getSalary() - p2.getSalary());
            }
        });

        return persons;
    }

    public ArrayList<Person> sortByName(ArrayList<Person> persons) {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        return persons;
    }
}
