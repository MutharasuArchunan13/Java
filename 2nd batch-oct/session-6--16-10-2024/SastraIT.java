interface Computer{
    void code();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code and deploy .... faster");
    }
}

class Laptop  implements Computer{
    public void code(){
        System.out.println("code and deploy ...... portable");
    }
}


class Developer{
    public void coding(Computer obj){
       obj.code();
    }
}

public class SastraIT {
    public static void main(String[] args) {
        Desktop objDes = new Desktop();

        Laptop objLap = new Laptop();

        Developer objDev  = new Developer();
        objDev.coding(objDes);

        
    }
}
