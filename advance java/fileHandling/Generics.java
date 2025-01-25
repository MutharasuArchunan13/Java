import java.util.Map;

class Box<T> {
    private T content;
    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
    
}

public class Generics {
public static void main(String[] args) {
    Box<String> boxRef = new Box<>();
    boxRef.setContent("Hello World");
    System.out.println(boxRef.getContent());

    Box<Integer> boxRef1 = new Box<>();
    boxRef1.setContent(76);
    System.out.println(boxRef.getContent());

   Map<String, Integer> map = Map.of("One", 1, "Two", 2, "Three", 3);
   // annotation

   Integer number = new Integer(null);

   // @Deprecated  --> to indicate that the method is deprecated
   // @SuppressWarnings("unchecked")

}
   
}

