
sealed class Computer permits Laptop{

}

non-sealed class Laptop extends Computer { // if you inhertied from Computer class then you have to use keyword final,sealed,non-sealed

}

class CellularMobile  extends Laptop{

}


public class SealedClass {
    public static void main(String[] args) {
        
    }
}
