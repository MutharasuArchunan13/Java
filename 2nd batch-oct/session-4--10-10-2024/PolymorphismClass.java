class Parents{
    public void car(){
        System.out.println("this car speed was 50km/h");
    }
}

class Child extends Parents{
    public void carRace(){
        System.out.println("this car speed was 100km/h");
    }
}



public class PolymorphismClass {
    public static void main(String[] args) {
        /*
         * poly -> many
         * morphism -> behavior
         * 
         * types:
         *  1. compile-time polymorphism(early binding) method-overloading
         *  2. run-time polymorphism(late binding) method overriding
         */

         Child childObj = new Child();
         childObj.car();
    }
}
