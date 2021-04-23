package Assignment7;

import java.util.ArrayList;
import java.util.List;

public class SortingLambdaExample {
    private static List<User> getUser() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Peter", 50, 15));
        users.add(new User("Jame", 90, 16));
        users.add(new User("Haha", 70, 17));
        return users;
    }

    public void showUserInfoByName() {
        List<User> users = getUser();
        System.out.println("Before sort");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("After sort");
        System.out.println("sort by name");
        users.sort((user1, user2) -> user1.getName().compareTo(user2.getName()));
        users.forEach((user) -> System.out.println(user));
    }

    public void showUserInfoBySalary() {
        List<User> users = getUser();
        System.out.println("Before sort");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("After sort");
        System.out.println("sort by salary");
        users.sort((o1, o2) -> Float.compare(o1.getSalary(), o2.getSalary()));
        users.forEach((user) -> System.out.println(user));
    }

    public void showUserInfoBySalaryRevert() {
        List<User> users = getUser();
        System.out.println("Before sort");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("After sort");
        System.out.println("sort by salary revert");
        users.sort((o1, o2) -> Float.compare(o2.getSalary(), o1.getSalary()));
        users.forEach((user) -> System.out.println(user));
    }
}
