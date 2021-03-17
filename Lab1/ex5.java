import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;


public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();

        tvShows.add("The Flash");
        tvShows.add("Avenger");
        tvShows.add("Batman");

        System.out.println();        
        System.out.println("forEach");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
        });

        System.out.println();        
        System.out.println("Iterator()");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println();        
        System.out.println("ListIterator()");

        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        System.out.println();        
        System.out.println("for-each loop");
        for(String tvShow: tvShows) {
            System.out.println(tvShow);
        }

        System.out.println();        
        System.out.println("for loop with index");
        for(int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
    }
}