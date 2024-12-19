class ArithmeticOperation extends Thread{
    public void run(){
        for(int index=0;index < 100;index++){
            System.out.println("hi" + index);
        }
    }
}

class ArithmeticOperation1 extends Thread{
    public void run(){
        for(int index=0;index < 100;index++){
            System.out.println("hello" + index);
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        ArithmeticOperation objArith = new ArithmeticOperation();
        ArithmeticOperation1 objArith1 = new ArithmeticOperation1();
        objArith.start();
        objArith1.start();

        /*
         * priority
         * min    -> 1
         * default -> 5
         * max      -> 10
         */
    }
}
