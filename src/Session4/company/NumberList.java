package Session4.company;

import java.util.ArrayList;

public class NumberList<T> {
    private ArrayList<T> numbers = new ArrayList<>();
    //T[] numbers =new T[10];
    public void add(T value) {
        numbers.add(value);
    }

    public void display() {
        for (var t : numbers) {
            System.out.println(t.toString());
        }
    }
}
