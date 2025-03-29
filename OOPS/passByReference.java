class human{
    int height;
    void add10(human o){
        o.height+=10;
    }
}


public class passByReference {
    public static void main(String args[]){
        human ob=new human();
        ob.height=150;
        System.out.println("Height before call:" + ob.height);
        ob.add10(ob);//reference
        System.out.println("Height after call:" + ob.height);
    }
}
