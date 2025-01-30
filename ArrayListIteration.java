import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Grapes");
        ListIterator<String> listIterator = items.listIterator();

        System.out.println("Iteration:");

        while (listIterator.hasNext()) {
            String item = listIterator.next();
            System.out.println(item);

            if ("Banana".equals(item)) {
                listIterator.set("Mango");
            }

            if ("Apple".equals(item)) {
                listIterator.add("Pineapple");
            }
        }

        System.out.println("\nResult after modification:");

        items.forEach(System.out::println);
    }
}
