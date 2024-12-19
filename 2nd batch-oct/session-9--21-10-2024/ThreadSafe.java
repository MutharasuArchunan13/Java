class Counter{
    int count;
    public synchronized void counting(){
        count++; // 10 10+1 --> assign  12 --> 11
    }
}

public class ThreadSafe {
    public static void main(String[] args) {
        Counter coObj = new Counter();
        Runnable counter1 = () ->{
            for(int index = 0; index < 1000 ;index++)
            {
                coObj.counting();
            }
        };

        Runnable counter2 = () -> {
            for(int index = 0; index < 1000 ;index++)
            {
                coObj.counting();
            }
        };

        Thread th1 = new Thread(counter1);
        Thread th2 = new Thread(counter2);

        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        }
        catch(Exception err){
            System.err.println(err);
        }
        System.out.println(coObj.count);

    }
}
