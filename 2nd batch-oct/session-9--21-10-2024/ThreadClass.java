
public class ThreadClass {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
                for(int index=0;index < 100;index++){
                    System.out.println("hi" + index);
                }
            };


        Runnable obj2 = () -> {
                for(int index=0;index < 100;index++){
                    System.out.println("hello" + index);
                }
            };

        Thread tObj1 = new Thread(obj1);
        Thread tObj2 = new Thread(obj2);
        tObj1.start();
        tObj2.start();
    }
}
