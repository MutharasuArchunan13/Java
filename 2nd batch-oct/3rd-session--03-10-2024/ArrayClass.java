import java.util.Random;
public class ArrayClass {
    public static void main(String[] args) {
        /*
         * while -> if you only know the condition but not the how many iteration it going do
         * for -> i know iteration count that time i can use for loop.
         */
        /*
         * array -> collection of values same data-type.
         *          we access individual value via index.
         * syntax -> datatype arrayName[];
         *        -> datatype arrayName[] = new datatype[size];
         */

         //int marks[]; // declaration
        // int marks[] = {93,88,85};
        // int marks[] = new int[3];

        // for(int index=0; index < 3;index++)
        // {
        //     marks[index] = index*20;
        // }

        // for(int index=0; index < 3;index++)
        // {
        //     System.out.println(marks[index]);
        // }

        // two dimensional array
        Random random = new Random();
        //  int marks[][] = new int[3][3];
        //  for(int rowIndex=0; rowIndex < 3; rowIndex++){
        //     for(int colIndex = 0; colIndex < 3; colIndex++){
        //        marks[rowIndex][colIndex]  = random.nextInt(100);
        //     }
        //  }

        int marks[][] = new int[3][];
        // limit the column size
        marks[0] = new int[3];
        marks[1] = new int[4];
        marks[2] = new int[2];
        for(int rowIndex=0; rowIndex < marks.length; rowIndex++){
            for(int colIndex = 0; colIndex < marks[rowIndex].length; colIndex++){
                marks[rowIndex][colIndex]  = random.nextInt(100);
            }
            }


         for(int innerArray[] : marks){
            for( int col : innerArray){
                System.out.print( col +" ");
            }
            System.out.println();
         }

    }
}
