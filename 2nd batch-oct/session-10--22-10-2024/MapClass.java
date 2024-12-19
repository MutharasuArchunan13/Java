import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String,Integer> student = new Hashtable<String,Integer>();
        // not following the sequence
        // key was unique and value not unique  --> keys are set and values are list
        student.put("science",91);
        student.put("tamil", 90);
        student.put("english", 90);
        student.put("math",99);
        student.put("science",81);

        System.out.println(student);
    }
}
