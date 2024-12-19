@FunctionalInterface
interface Bike{
    void navigation();
}

public class FunctionalInterfaceClass {
    public static void main(String[] args) {
        /*
         * 1. normal interface  --> it a interface,
         * 2. functional interface --> A interface have only one abstract method that one called as functional interface
         * 3. marker interface
         */
        Bike obj = () -> System.out.println( " now your have the navigation system.");

        obj.navigation();
    }
}
