package Session6;

public class testSession6 {
  public static void main(String[] args) {
    SingletonExample obj1 = SingletonExample.getInstance();
    SingletonExample obj2 = SingletonExample.getInstance();

    System.out.println(obj1 == obj2);
  }
}
