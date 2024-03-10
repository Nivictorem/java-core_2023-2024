package lr9.Task6;

import java.util.HashMap;

public class TaskWithHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        String str = "Hash table based implementation of the Map interface This implementation";
        int count = 0;
        for (String i : str.split(" "))
        {
            hMap.put(count++, i);
        }
        for (var i: hMap.keySet()) {
            if(i>5)
                System.out.print(hMap.get(i) + " ,");
        }
        System.out.println();
        int sum = 1;
        for (var i: hMap.keySet()) {
            if(hMap.get(i).length() > 5)
            {
                sum = i*sum;
            }
        }
        System.out.println(sum);
    }
}
