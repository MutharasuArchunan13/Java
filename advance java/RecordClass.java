// class Mutharasu{
//     private final String name;
//     private final int age;

//     public Mutharasu(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         result = prime * result + age;
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Mutharasu other = (Mutharasu) obj;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         if (age != other.age)
//             return false;
//         return true;
//     }

//     @Override
//     public String toString() {
//         return "Mutharasu [name=" + name + ", age=" + age + "]";
//     }
    

// }

record Mutharasu(String name, int age) {

    public Mutharasu{
        // validation
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
    

public class RecordClass {
    public static void main(String[] args) {
        Mutharasu muthObjRef = new Mutharasu("phoenix", 10);
        Mutharasu muthObjRef2 = new Mutharasu("phoenix", 10);
        // System.out.println(muthObjRef.name());
        // System.out.println(muthObjRef.age());

         System.out.println(muthObjRef);
        System.out.println(muthObjRef.equals(muthObjRef2));
    }
}
