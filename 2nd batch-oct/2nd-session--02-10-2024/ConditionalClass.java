public class ConditionalClass {
    public static void main(String[] args) {
        /*
         * conditional statement -> control the flow of execution.
         * if(condition){
         *  // executable code
         * }
         * 
         * 2. if -else 
         *   if(condition){
         *  // executable code
         * }
         * else{
         *  // executable statements 
         * }
         */
        // print the greatest value.
        // int input1 = 10;
        // int input2 = 5;
        // if (input2 > input1)
        //     System.out.println("input2 was greater than input1");
            
        // else
        //     System.out.println("input1 was greater than input2");

        // if the salary < 10000 -> 1000(bonus)  if salary == 10000 < 15000 -> bonus 2000
        //  > 15000-> 3000(bonus)
        // int salary = 15000;
        // if(salary < 10000)
        //     System.out.println(" your bonus was 1000");
        // else if(salary >= 10000 && salary < 15000)
        //     System.out.println("your bonus was 2000");
        // else
        //     System.out.println(" your bonus was 3000");

        // switch statement
        /*
         * switch(condition){
         *  case value:
         *      // executable code
         *  default:
         *      // executable code
         * }
         */

        String day = "monday" ;
        // traditional way
        // switch (day) {
        //     case "monday":
        //         System.out.println("alarm set to 6am");
        //         break;
        //     case "tuesday","wednesday":
        //         System.out.println(" alarm set to 7am");
        //         break;
        //     default:
        //         System.out.println("alarm set to  9am");
        // }

        // // new way
        // String result = switch (day) {
        //     case "monday" ->  day +":"+ "alarm set to 6am";
        //     case "tuesday","wednesday" ->  " alarm set to 7am";
        //     default ->  "alarm set to  9am";
                
        // };
        
        // System.out.println(result);

    }
}

