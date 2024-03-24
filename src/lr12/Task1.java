package lr12;

import java.sql.Time;
import java.time.LocalTime;

public class Task1 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Thread is " + Thread.currentThread().getName() + " Current time is " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

        }, "Thread 1");
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Thread is " + Thread.currentThread().getName() + " Current time is " + LocalTime.now());
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

        }, "Thread 2");
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
