package thinking_in_java;

public class ExampleThread {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread thread = new MyThread();
            thread.start();
        }
    }
}

class MyThread extends Thread {
    int a = 0;
    @Override
    public void run() {
        a++;
        System.out.println("complete " + a + " " + getName());
    }
}
