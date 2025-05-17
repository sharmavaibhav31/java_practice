public class Threads {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.println("Current Thread: "+ t1);
        t1.setName("My Thread 1");
        System.out.println("After name change: "+ t1);
        try{
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}

