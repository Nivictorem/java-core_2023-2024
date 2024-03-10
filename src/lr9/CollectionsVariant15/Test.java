package lr9.CollectionsVariant15;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        System.out.println(TimeComp(5));

    }
    public static ArrayDeque<Integer> Setdeaue()
    {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
        for (int i = 1; i < 15000000; i++)
        {
            if(i == 15*1000000/2)
                arrayDeque.add(i-1);
            else
                arrayDeque.add(i);
        }
        return arrayDeque;
    }

    public static long TimeComp(int count)
    {
        //ArrayDeque<Integer> arrayDeque = Setdeaue();
        TreeSet<Integer> treeSet = SetTreeSet();
        //ArrayList<Integer> arrayList = SetArrayList();

        long start = System.currentTimeMillis();
        RealizeTreeSet(count, treeSet);
        //RealizeDeque(count, arrayDeque);
        //RealizeArrayList(count, arrayList);

        long finl = System.currentTimeMillis();
        return finl - start;
    }



    private static TreeSet<Integer> SetTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < 15000000; i++)
        {
            treeSet.add(i);
        }
        return treeSet;
    }

    private static ArrayList<Integer> SetArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 15*1000000; i++)
        {
            arrayList.add(i);
        }
        return arrayList;
    }

    private static void RealizeDeque(int count, ArrayDeque<Integer> arrayDeque) {
        if(count == 0)
        {
            arrayDeque.addLast(0);
        }
        else if(count == 1)
        {
            int j = 0;
            ArrayDeque<Integer> arr = new ArrayDeque<Integer>();
            for (var i :
                    arrayDeque)
            {
                arr.add(arrayDeque.pop());
                if(j == arrayDeque.size()/2)
                {
                    arrayDeque.add(5);
                    break;
                }
                j++;
            }
            for (var i :
                    arr)
            {
                arrayDeque.add(arr.pop());
            }
        }
        else if(count == 2)
        {
            arrayDeque.addFirst(1);
        }
        else if(count == 3)
        {
            arrayDeque.removeFirst();
        }
        else if(count == 4)
        {
            int j = 0;
            ArrayDeque<Integer> arr = new ArrayDeque<Integer>();
            for (var i :
                    arrayDeque)
            {
                arr.add(arrayDeque.pop());
                if(j == arrayDeque.size()/2)
                {
                    arrayDeque.pop();
                    break;
                }
                j++;
            }
            for (var i :
                    arr)
            {
                arrayDeque.add(arr.pop());
            }
        }
        else if(count == 5)
        {
            arrayDeque.pop();
        }
        else if(count == 6)
        {
            int j = 0;
            for (var i : arrayDeque)
            {
                if(j==7500000)
                    break;
                j++;
            }
        }
    }
    private static void RealizeArrayList(int count, ArrayList<Integer> arrayList) {
        if(count == 0)
        {
            arrayList.add(0, 0);
        }
        else if(count == 1)
        {
            arrayList.add(15*1000000/2, 0);
        }
        else if(count == 2)
        {
            arrayList.add(0);
        }
        else if(count == 3)
        {
            arrayList.remove(0);
        }
        else if(count == 4)
        {
            arrayList.remove(15*1000000/2);
        }
        else if(count == 5)
        {
            arrayList.remove(arrayList.size()-1);
        }
        else if(count == 6)
        {
            arrayList.get(7500000);
        }
    }
    private static void RealizeTreeSet(int count, TreeSet<Integer> treeSet) {
        if(count == 0)
        {
            treeSet.add(0);
        }
        else if(count == 1)
        {
            treeSet.add(15*1000000/2);
        }
        else if(count == 2)
        {
            treeSet.add(15*1000000+1);
        }
        else if(count == 3)
        {
            treeSet.remove(0);
        }
        else if(count == 4)
        {
            treeSet.remove(15*1000000/2);
        }
        else if(count == 5)
        {
            treeSet.remove(15*1000000-1);
        }
        else if(count == 6)
        {
            treeSet.ceiling(7500000);
        }
    }
}
