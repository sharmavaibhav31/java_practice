class SynchThread extends Thread {
    String msg;

    public SynchThread(String s) {
        msg = s;

    }

    public static void DisplayMessage(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }

    public void run() {
        DisplayMessage(msg);
    }
}

class SynchDemo {
    public static void main(String[] args) {

        SynchThread c1 = new SynchThread("1st task");
        c1.start();

        SynchThread c2 = new SynchThread("2nd task");
        c2.start();

    }
}