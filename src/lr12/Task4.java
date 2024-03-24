package lr12;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads =  new Thread[10];
        for (int i = 0; i < threads.length; i++)
        {
            threads[i] = new Thread(() ->
            {
                System.out.println(Thread.currentThread().getName());
            });
        }
        for (int i = 0; i < threads.length; i++)
        {
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++)
        {
            threads[i].join();
        }
    }
}
