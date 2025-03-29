class homoSapien{
    int height;

    homoSapien(int h) {
        height = h;
    }

    homoSapien add10(homoSapien H) {
        homoSapien temp= new homoSapien(height+10);
        return temp;
}
}


public class returningObject {
    public static void main(String args[]) {
        homoSapien p1=new homoSapien(150);
        homoSapien p2;

        p2 = p1.add10(p1);
        System.out.println("Height of first person:"+p1.height);
        System.out.println("Height of second person:"+p2.height);
    }   
}
