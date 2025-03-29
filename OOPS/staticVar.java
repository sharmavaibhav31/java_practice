

class person{
    int age, height;
    static int totalPerson;
    public static void havingFun(){
        System.out.println("Person is having fun");
    }
    person(int a, int h){
        age = 0; 
        height = 0;
        totalPerson += 1;
    }
}



public class staticVar {
    public static void main(String args[]){
        person p1 = new person(21,165);
        person p2 = new person(51, 160);
        //System.out.println("Age of Pi:" + P1.age);
        //int tempAge= P1.getAge();
        System.out.println("Age of P1:" + p1.totalPerson);
        System.out.println("Age of P2:" + p2.totalPerson);

        person.havingFun();
        p1.havingFun();
    }
    
}
