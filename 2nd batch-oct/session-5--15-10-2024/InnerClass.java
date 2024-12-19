class A{
    public void show(){
        System.out.println("i'm in A");
    }

    class B{
        public void show1(){
            System.out.println("i'm in B");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj2 = obj.new B();
        obj2.show1();
       
    }
}
