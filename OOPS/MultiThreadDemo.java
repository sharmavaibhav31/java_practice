class MyThread implements Runnable{
    Thread t;
    String name;

    MyThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);

        System.out.println("Child Thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread " + this.name + " " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread" + this.name);
    }
}

class MultiThreadDemo {
    public static void main(String[] args) {
        new MyThread("One");
        new MyThread("Two");
        new MyThread("Three");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}