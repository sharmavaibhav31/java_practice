class B {
    int i, j;

    B(int a, int b) {
        i = a;
        j = b;
    }
    void show(int c) {
        System.out.println("i and j:" + i + "" + j);
    }
}

class C extends B {
    int k;
    C(int a, int b, int c){
        super(a,b);
        k=c;
    }

    void show(String msg) {
        System.out.println(msg + "k");
    }
}

public class A{
    public static void main(String[] args) {
        C c1 = new C(1, 2, 3);
        c1.show("This isK:");
        c1.show();
    }
}

