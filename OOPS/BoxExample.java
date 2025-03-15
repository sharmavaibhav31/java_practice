class Box   {
    double length, width, height;

    Box(double l, double w, double h)   {
        length = l;
        width = w;
        height = h;
    }

    double calculateVolume()   {
        return length*width*height;
    }

    void displayDetails()   {
        System.out.println("Boc Dimensions:"+length+"X"+width+" X "+height);
        System.out.println("Volume:"+calculateVolume());
    }
    
    double calculateSurfaceArea(){
        return 2*((length*width)+(width*height)+(length*height));
    }
}

public class BoxExample{
    public static void main(String[] args){
        Box Box1=new Box(2,4,6);
        Box Box2=new Box(3,5,7);

        Box1.displayDetails();
        Box2.displayDetails();

        System.out.println("Box 1 volume:"+Box1.calculateVolume());
        System.out.println("Box 2 volume:"+Box2.calculateVolume());
        System.out.println("Box 1 area:"+Box1.calculateSurfaceArea());
        System.out.println("Box 2 area:"+Box2.calculateSurfaceArea());       
    }
}