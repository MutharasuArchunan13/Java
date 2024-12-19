abstract class Parent{
    public void house(){
        System.out.println("house with garden..........");
    }

    abstract public void loan();
}

class Child extends Parent{
    public void loan(){
        System.out.println( "now i have the job i will in one month");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.loan();
        obj.house();
    }
}
