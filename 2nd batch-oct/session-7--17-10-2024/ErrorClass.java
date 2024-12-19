public class ErrorClass {
    public static void main(String[] args) {
        /*
         * types:
         *  1. compilation (syntax)
         *  2. run-time
         *  3. logical error
         */

        int value1 = 10;
        int value2 = 2;  // 10/0 -> infinite
        
        int values[] = {1,2,3};
        /*
         *   try{
         *      critical statements;
         *   }
         *   catch(Type variable_name){
         *     // handle the exception;
         *   }
         */
        
        String name = null;

        try{
            int result = value1 / value2;
            System.out.println(result);

            System.out.println(values[2]);

            System.out.println(name.length());
        }
        catch(ArithmeticException error){
            System.err.println("Don't put divisor as 0.");
        }
        catch(ArrayIndexOutOfBoundsException error){
            System.out.println(" checkout you index value ");
        }
        catch(Exception error){
            System.out.println("error occurred"+ error);
        }
        
        System.out.println("Execution completed successfully.....");

    }
}
