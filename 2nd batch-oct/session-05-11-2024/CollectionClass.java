import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(9);
        numbers.add(8);
        numbers.add(7);

        System.out.println(numbers.get(0));
        for(int n:numbers){
            System.out.println(n*10);
        }
    }
}
