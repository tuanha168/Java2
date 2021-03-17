import java.util.ArrayList;
import java.util.List;


public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> language = new ArrayList<>();

        language.add("C");
        language.add("C++");
        language.add("Python");
        language.add("Java");
        language.add("Vietnamese");

        System.out.println("Top "+language.size()+" language of the world");
        System.out.println(language);

        language.remove(2);
        System.out.println("After remove(2): "+language);

        boolean isRemove = language.remove("C");
        System.out.println("After remove(\"C\"): "+language);

        List<String> bakaLanguage = new ArrayList<>();
        bakaLanguage.add("Java");

        language.removeAll(bakaLanguage);
        System.out.println("After removeAll(bakaLanguage): "+language);

        language.removeIf(n -> (n.charAt(0) == 'V'));
        System.out.println("After remove all elements start with \"V\": "+language);        

        language.clear();
        System.out.println("After clear(): "+language);
    }
}