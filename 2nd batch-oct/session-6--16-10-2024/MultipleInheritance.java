
interface Mom{
   void phone();
}

interface Dad{
     void phone();
}

class Child implements Mom,Dad{
    public void phone(){
        System.out.println("i need calling...........");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        
    }
}
