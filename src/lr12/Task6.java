package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task6 {
    private static final ArrayList<Integer> arrSum = new ArrayList<Integer>();
    static class SomeThread extends Thread
    {
        int[] arr;
        SomeThread(int[] arr)
        {
            this.arr = arr;
            start();
        }
        public void run()
        {
            arrSum.add(Arrays.stream(arr).sum());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        int[] bigArrays = new int[48];
        for(int i = 0; i < bigArrays.length; i++)
        {
            bigArrays[i] = (int)(Math.random()*100);
        }
        //System.out.println(Arrays.stream(bigArrays).sum());
        int procCount = Runtime.getRuntime().availableProcessors();
        var arrayList = GetArrayList(procCount, bigArrays);
        SomeThread[] threads =  new SomeThread[procCount];
        for (int i = 0; i < arrayList.size(); i++)
        {
            threads[i] = new SomeThread(arrayList.get(i));
        }
        for (int i = 0; i < arrayList.size(); i++)
        {
            threads[i].join();
        }
        System.out.println(arrSum.stream().mapToInt(x-> x).sum());
    }
    public static ArrayList<int[]> GetArrayList(int procCount, int[] bigArrays )
    {
        ArrayList<int[]> arrayList = new ArrayList<>();
        int stepLen = bigArrays.length / procCount;
        if(stepLen<=0)
            stepLen = 1;
        int start = 0;
        for (int i = 1; i <= procCount; i++)
        {
            int count = stepLen;
            if(bigArrays.length > procCount && bigArrays.length % procCount != 0 && i == procCount)
            {
                count = stepLen + bigArrays.length % procCount;
            }
            int[] s = new int[count];
            for(int j = 0; j < count; j++)
            {
                s[j] = bigArrays[start+j];
            }
            arrayList.add(s);
            start += count;
            if(i == bigArrays.length)
                break;
        }
        return arrayList;
    }
}
