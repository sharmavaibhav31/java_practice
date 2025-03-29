class Test{
    void add10(int a){
        a+=10;
    }
}


class passByValue{
    public static void main(String[] args) {
        Test ob=new Test();
        int a=15;
        System.out.println("Value of a before call:" + a);
        ob.add10(a);
        System.out.println("Value of a before call:" + a);
    }
}