
interface Car{
     void navigationSystem();

     void autoPilot();

}


class Marutu implements Car{
    public void navigationSystem(){
        System.out.println("now the navigation system was enabled....");
    }

    public void autoPilot(){
        System.out.println("now the auto-pilot enabled");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
       /*
        * interface is contract -> it have only the abstract methods.                        
        */
        Marutu objCar = new Marutu();
        objCar.autoPilot();
        objCar.navigationSystem();
    }
}
