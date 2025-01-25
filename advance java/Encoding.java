import java.util.Base64;

public class Encoding {
    public static void main(String[] args) {
        String name = "Muthu";
         
        String encodeData = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println("Encoded data: "+encodeData);

       byte[] decodedDate = Base64.getDecoder().decode(encodeData);
       String deString = new String(decodedDate);
       System.out.println("Decoded data: "+deString);
    }
}
