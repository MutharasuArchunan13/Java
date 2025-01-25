import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> nuList = Arrays.asList(14,6,11,12,24);
        // nuList.forEach(n-> System.out.println(n));

        Stream<Integer> data = nuList.stream();
        Stream<Integer> sortedData = data.sorted();
        sortedData.forEach(n-> System.out.println(n));
                    // .map(n -> n*2)
                    //     .forEach(n-> System.out.println(n));

        // again try to print the steam data
        //stream.forEach(n-> System.out.println(n));
    }
}
