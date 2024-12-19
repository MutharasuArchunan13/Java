
class College {
    String name;
    String city;
    int grade;

    public void show(){
        System.out.println(name + " located " + city + "grade was" + grade);
    }

    public boolean equals( College that){
        if(this.city.equals(that.city) && (this.name.equals(that.name)) && (this.grade == that.grade))
            return true;
        else
            return false;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
       College  clgObj1 = new College();
       clgObj1.name = "university houston";
       clgObj1.city = "houston";
       clgObj1.grade = 9;
       clgObj1.show();

       College  clgObj2 = new College();
        //    clgObj2.name = "sastra college";
        //    clgObj2.city = "thanjavur";
        clgObj2.name = "university houston";
        clgObj2.city = "houston";
        clgObj2.grade = 9;

       clgObj2.show();

       boolean result = clgObj1.equals(clgObj2);
       System.out.println(result);
    }
}