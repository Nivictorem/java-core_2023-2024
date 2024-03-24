package lr12;

import java.time.LocalTime;

public class Task2 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            for(int i = 1; i < 11; i++)
            {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

        }, "Thread 1");
        t1.start();
        t1.join();
    }
}
