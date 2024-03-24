package lr12;

public class Task3 {
    private static final Object lock = new Object();
    private static int num = 1;
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> { synchronized (lock){
            while (num <= 10 )
            {
                System.out.println(Thread.currentThread().getName() + " point 1");
                if(num%2 == 1)
                {
                    System.out.println(num);
                    num++;
                }
                else
                {
                    try {
                        lock.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
                System.out.println(Thread.currentThread().getName() + " point 2");
            }

        }}, "Thread 1");
        Thread t2 = new Thread(() -> { synchronized (lock){
            while (num <= 10 )
            {
                System.out.println(Thread.currentThread().getName() + " point 1");
                if(num%2 == 0)
                {
                    System.out.println(num);
                    num++;
                }
                else
                {
                    try {
                        lock.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                lock.notifyAll();
                System.out.println(Thread.currentThread().getName() + " point 2");
            }

        }}, "Thread 2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
