class Human{
    String name;
    int age;

    Human(){
        name="";
        age=0;
        System.out.println("\nI am just born");
    }
    Human(String n, int a){
        name= n;
        age = a;
    }
    void speak(){
        System.out.println("\nMy My name is  "+ name + "\nMy age is  " + age);
    }
}

class Student extends Human {
    String studentId;
    String standard;

    Student(String n, int a, String sId, String std) {
        super(n, a);
        studentId = sId;
        standard = std;
    }

    void speak() {
        super.speak();
        System.out.println("I am studying in standard  " + standard + "\nMy student idis:  " + studentId + '\n');
    }
}

class PGStudent extends Student {
    String specilization;

    public PGStudent(String n, int a, String sId, String std) {
        super(n, a, sId, std);
        this.specilization = specilization;
    }

    void research() {
        System.out.println("I am  a post grad student specilizing in  " + specilization);   
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Human h =new Human("Manav", 20);
        Student s = new Student("Asha", 17 , "S123", "12th");
        h.speak();
        s.speak();
    }
}