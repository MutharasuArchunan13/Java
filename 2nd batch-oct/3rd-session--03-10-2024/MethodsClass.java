class Calculator{
    String brand; // just declared

    public int addition(int value1, int value2){
        return value1 + value2 ;
    }
    public int addition(int value1, int value2,int value3){
        return value1 + value2+value3 ;
    }

    public double addition(int value1, double value2){
        return value1 + value2 ;
    }
    /*
     *  accessor return_type methodName(datatype parameter1, datatype parameter2...)
     * {
     *   //  executable codes.
     * }
     * 
     * parameter vs argument
     *   -> while defining method/function that we know as parameters
     *   -> actual values while call that method or function.
     */

}

public class MethodsClass {
    public static void main(String[] args) {
        // addition(5,6); // this one called as the argument.
        /*
         * 
         * Method overloading
         *   Method name was same but number of parameters differ or parameters type
         */
        Calculator calObj = new Calculator();
        double result = calObj.addition(10, 20.34);
        System.out.println(result);



    }
}
