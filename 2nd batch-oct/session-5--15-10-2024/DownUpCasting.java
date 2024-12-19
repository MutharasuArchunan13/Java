class Computer{ 
    public void code(){
        System.out.println("coding in computer");
    }
}

class AdvComputer extends Computer{ 
    public void code1(){
        System.out.println("coding in advance computer");
    }
}


public class DownUpCasting {
    public static void main(String[] args) {
        // double num1 = 10.1;
        // int num2 = (int)num1; // type casting
        // System.out.println(num2);


        Computer obj = (Computer)new AdvComputer(); // Computer obj = (Computer)new AdvComputer()  up-casting
        // obj.code1();
        AdvComputer obj1 = (AdvComputer)obj; // down-casting
        obj1.code();

    }
}
