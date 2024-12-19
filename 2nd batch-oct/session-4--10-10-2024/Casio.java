import arithmeticTool.advncCalc;

public class Casio {
    /*
     * package: collection of files
     */
    /*
     * public --> available every places.
     * private --> within the class
     * protected -->  subclass able the acess the property
     * default --> available only same level folder or packages
     */
    public static void main(String[] args) {
        advncCalc obj = new advncCalc();
        obj.brand = "lenovo";
        int result = obj.sub(20, 10);
        System.out.println(result);
    }
}
