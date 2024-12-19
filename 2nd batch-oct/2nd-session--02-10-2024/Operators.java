
public class Operators {
    public static void main(String[] args) {
        /*
         *  i'm going to create a  calc --> add two numbers--> 
         * 1. solve the real world problems
         * 2. need to process data
         * 3. categories the data.
         * completed the first task.
         */

        /*
         * Operators: --> symbol to perform the operation 
         *  1. Arithmetic operators
         *     +, -, *,/,%
         *  2. Relational operators(comparison)
         *     < , > , <= , >=, ==, != 
         *     
         *  3. logical operators(compare more than one expression)
         *     && , || , !
         */

        // int, float,char,byte,boolean,short, long, double
        // data = 9
        /*
         * int -> 4 byte  -> 32 bits   =====> 1 byte => 8 bits,  1 nibble => 4 bits
         * -2,147,483,648 to 2,147,483,647
         * byte -> 1 byte  => 8 bit --> -128 to 127
         */
        // byte data = 9;
        // System.out.println(data);

        // char alphabet = 'a';
        // System.out.println(alphabet);

        // boolean cond = false;
        // System.out.println(cond);

        // int result = 4 % 15;  // 4 and 3 was operand , + - ect  those operator
        // System.out.println(result);

        // relation operator
        int value1= 20;
        int value2 = 20;

        boolean finalResult =  (value1 == value2) && (value1 >= value2);
        System.out.println(finalResult);

    }
}
