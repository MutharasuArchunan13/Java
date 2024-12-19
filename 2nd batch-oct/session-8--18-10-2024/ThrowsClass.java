class Students{
    public void show() throws ClassNotFoundException{
            Class.forName("cla");
            System.out.println("class was found");
    }
}

public class ThrowsClass {
    public static void main(String[] args) throws ClassNotFoundException{
        Students obj = new Students();
        obj.show();
    }
}
