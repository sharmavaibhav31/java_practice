import java.util.ArrayList;

public class CollectionsPracatice {
    public static void mian(String[] args) {
        System.out.println("Hello World");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list1.addAll(list2);
        System.out.println(list1);
        list2.addAll(list1);
        System.out.println(list2);
    }
}
