public class JaggedArrayClass {

    public static void main(String[] args) {
        int numbers[][] = new int[3][];
        /*
         * The row was fixed but the column was dynamic
         */
        numbers[0] = new int[3];
        numbers[1] = new int[4];
        numbers[2] = new int[2];

        for(int index = 0; index < 3; index++){ // rows
            for(int index2 = 0; index2 < numbers[index].length;index2++ ) { // columns
                numbers[index][index2] = (int)(Math.random()*10);
            }
        }

        // for(int index = 0; index < 3; index++){ // rows
        //     for(int index2 = 0; index2 < numbers[index].length;index2++ ) { // columns
        //          System.out.println(numbers[index][index2]);
        //     }
        // }

        for(int n[]:numbers){
            for(int mm:n){
                System.out.print(mm + " ");
            }
            System.out.println();
        }


        int num[] = new int[3];
        int newNum[] = new int[10];
        
     }
}