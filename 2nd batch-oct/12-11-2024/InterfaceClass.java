@FunctionalInterface
interface Calc{
    int add(int number1, int number2);
}


public class InterfaceClass{
    public static void main(String[] args) {
        /*
         * class - class     -> extends
         * interface - class -> implements
         * interface - interface -> extends
         * 
         * functional interface -> it contains only one abstract
         *    lambda expression: 
         */

        //  new Calc(){ // anonymous class
        //     public int add(int number1, int number2)

         Calc calObject = ( number1, number2) ->  number1 + number2;

          int result = calObject.add(10, 100);
          System.out.println(result);
    }
}