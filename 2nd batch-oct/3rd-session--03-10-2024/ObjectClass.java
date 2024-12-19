
class BTechClass{
    // objects
    // attribute(properties or variables) & behavior(methods)
    Integer lights;
    String chair ;

    public void studying(){
        System.out.println(" studying.............");
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        /*
        * oop --> object oriented programming
        *  object => attribute & behavior, object represent of the class.
        *            attribute -> (knows)
        *            behavior -> (does)
        * 
        *  class => collection of objects. this as blueprint.
        *          class pen{
        *                      }
        * 
        * finalYearBE{
        * 
        *              }
        * rep -> now i can access the entire class.
        * 
        * a=b
        * b=c
        * therefore -> a = c
        * 
        */
        // syntax -> type Object/representation = new contractor();
        BTechClass repObj = new BTechClass();
        repObj.chair ="avva";
        repObj.lights = 10;
        // repObj.studying();
        System.out.println(repObj.chair + ":"+ repObj.lights);
    }
}
