class DefaultValueException extends Exception{
    public DefaultValueException(String error){
        super(error);
    }
}

public class ErrorClass {
    public static void main(String[] args) {
        /*
         * throw -> 
         * throws -> 
         */
        int value1 = 10;
        int value2 = 20;  // 10/0 -> infinite
        try{
            int result = value1 / value2; // 10/20
            System.out.println(result);
            if(result ==0)
              throw new DefaultValueException("this is default value : "+value2);
        }
        catch(DefaultValueException err){
            System.out.println("value handling exception" + err);
        }
        catch(ArithmeticException error){
            System.err.println("try to give different divisor" + error);
        }
        catch(ArrayIndexOutOfBoundsException error){
            System.out.println(" checkout you index value ");
        }
        catch(Exception error){
            System.out.println("error occurred"+ error);
        }
        finally{
            System.out.println("Execution completed successfully.....");
        }
        

    }
}
