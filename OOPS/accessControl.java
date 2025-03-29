class Person{
    private int age;
    
    public int height;
    Person(int a, int h){
        age = 0; height = 0;
    }

    public int getAge(){
        return age;
    }

}



public class accessControl {
    public static void main(String args[]){
        Person P1 = new Person(21,165);
        //System.out.println("Age of Pi:" + P1.age);
        int tempAge= P1.getAge();
        System.out.println("Age of P1:" + tempAge);
        System.out.println("Height of P1:" + P1);
    }
    
}
