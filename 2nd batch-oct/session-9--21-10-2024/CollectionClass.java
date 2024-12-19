import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        /*
         * Collection -> concept or library

         * Collections -> class
         * Collection  -> interface it doesn't contain the index
         *   | - List
         *         |- ArrayList
         *         |- LinkedList
         */
        /*
         * in array the memory size need to declare so it will fixed. ArrayList was dynamic
         */
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(5);

        System.out.println(numbers.get(2));
        // for(int n: numbers)
        // {
        //     System.out.println(n);
        // }
    }
}
