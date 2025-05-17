class MyThread implements Runnable {
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
        System.out.println("Exiting child thread " + this.name);
    }
}
class creatingThread3 {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("One");
        MyThread thread2 = new MyThread("Two");
        MyThread thread3 = new MyThread("Three");
        System.out.println("thread One is alive: " + thread1.t.isAlive());
        System.out.println("thread Two is alive: " + thread2.t.isAlive());
        System.out.println("thread Three is alive: " + thread3.t.isAlive());
        try {
            System.out.println("Waiting for threads to finish.");
            thread1.t.join();
            thread2.t.join();
            thread3.t.join();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("thread One is alive: " + thread1.t.isAlive());
        System.out.println("thread Two is alive: " + thread2.t.isAlive());
        System.out.println("thread Three is alive: " + thread3.t.isAlive());
    }
}
