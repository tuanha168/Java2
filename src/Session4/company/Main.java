package Session4.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("john");
        names.add("Marry");

        var name=names.get(0);
        System.out.println("Phan tu 0: " +name);

        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(20);

        int number2=numbers.get(2);
        System.out.println("Phan tu thu 3: " + number2);

        NumberList<Integer> numberList =new NumberList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.display();

        StudentPair<String,Integer> s =new StudentPair<String,Integer>("John",1);
        s.displayInformation();
        StudentPair<String,String> s1 =new StudentPair<>("John","S001");
        s1.displayInformation();

        int n=12_3_4_56;
        System.out.println("n=" + n);
    }
}
