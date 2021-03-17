import java.util.ArrayList;
import java.util.List;


public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add(2, "Elephant");

        List<String> newAnimals = new ArrayList<>();

        newAnimals.add("Meo");
        newAnimals.addAll(animals);

        System.out.println("Top "+newAnimals.size()+" Animals of the world");
        System.out.println(newAnimals);

        String bestAnimal = newAnimals.get(0);
        String lastAnimal = newAnimals.get(newAnimals.size() -1);

        System.out.println("Best Animal: "+bestAnimal);
        System.out.println("Last Animal: "+lastAnimal);

        newAnimals.set(4, "Meo con");
        System.out.println("Modified animals: "+newAnimals);
    }
}