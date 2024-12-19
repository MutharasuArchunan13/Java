
class ThreadCls1 extends Thread{
    public void run(){
        for(int i =0;i<100;i++){
            System.out.println("hello");
        }
    }
}


class ThreadCls2 extends Thread{
    public void run(){
        for(int i =0;i<100;i++){
            System.out.println("hi");
        }
    }
}



public class ThreadClass  {
    public static void main(String[] args) {
        /*
         * min => 1
         * default => 5
         * max => 10
         */
        ThreadCls1 tObj1 = new ThreadCls1();
        ThreadCls2 tObj2 = new ThreadCls2();
        tObj1.start();
        tObj2.start();
    }
}
