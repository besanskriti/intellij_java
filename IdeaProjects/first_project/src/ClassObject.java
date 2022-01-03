public class ClassObject {
    public static void main(String[] args) {

        Person Sanshu = new Person();
        Sanshu.name = "Sanskriti Sharma";
        Sanshu.age=11;
        Sanshu.gender="girl";
        Sanshu.handtype="right-handed";
        Sanshu.WritingHand();

        Person Pranky = new Person();
        Pranky.name = "Pankaj Sharma";
        Pranky.age=39;
        Pranky.gender="boy";
        Pranky.handtype="left-handed";
        Pranky.WritingHand();
    }
}

class Person{
    String name;
    int age;
    String gender;
    int weight;
    String handtype;

    void WritingHand() {
        if (handtype=="left-handed"){
            System.out.println(name + " writes with left hand.");
        }
        else{
            System.out.println(name + " writes with right hand.");
        }

    }

}