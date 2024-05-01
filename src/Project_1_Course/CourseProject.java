package Project_1_Course;

import java.io.*;
import java.util.*;

public class CourseProject {
    static int[][] matrixWeight = {
            {Integer.MAX_VALUE, 25, 40, 31, 27},
            {5, Integer.MAX_VALUE, 17, 30, 25},
            {19, 15, Integer.MAX_VALUE, 6, 1},
            {9, 50, 24, Integer.MAX_VALUE, 6},
            {22, 8, 7, 10, Integer.MAX_VALUE}
    };
    public static void main(String[] args) {
        try {
            SetMatrixWieght();
        }
        catch (Exception e)
        {}
        System.out.println("Укажите номер начальной вершины от 1 до " + matrixWeight.length);
        Scanner in = new Scanner(System.in);
        int startPoint = in.nextInt();
        int[] startPath = new int[matrixWeight.length];
        startPath[0] = startPoint;
        var arr = GetMinPath(startPath, 1);
        for (int i : arr.keySet()) {
            var path = arr.get(i).toArray();
            System.out.print("Минимальный путь: ");
            for (int j = path.length-1; j>=0; j--)
            {
                System.out.print(path[j]);
            }
            System.out.print(startPoint);
            System.out.println();
        }
        System.out.println(arr.keySet().stream().findFirst());

    }

    public static HashMap<Integer, ArrayList<Integer>> GetMinPath(int[] path, int pos)
    {
        HashMap<Integer, ArrayList<Integer>> bellManFunc = new HashMap<>();
        ArrayList<Integer> pathRevers = null;
        int minElem = 0;
        if(pos == path.length)
        {
            pathRevers = new ArrayList<>();
            pathRevers.add(path[pos-1]);
            minElem = matrixWeight[path[pos-1]-1][path[0]-1];
            bellManFunc.put(minElem, pathRevers);
            return bellManFunc;
        }
        for(int i = 1; i <= path.length; i++)
        {
            int finalI = i;
            if(Arrays.stream(path).anyMatch(x-> x == finalI))
            {
                continue;
            }
            int[] newPath = path.clone();
            newPath[pos] = i;
            HashMap<Integer, ArrayList<Integer>> result = GetMinPath(newPath, pos+1);//
            minElem = result.keySet().stream().toList().get(0);
            pathRevers = result.get(minElem);
            pathRevers.add(path[pos-1]);
            bellManFunc.put(matrixWeight[newPath[pos-1]-1][newPath[pos]-1] + minElem,
                    pathRevers) ;
        }
        minElem = Collections.min(bellManFunc.keySet());
        HashMap<Integer, ArrayList<Integer>> minPath = new HashMap<>();
        minPath.put(minElem, bellManFunc.get(minElem));
        return minPath;
    }
    public static void SetMatrixWieght() throws IOException
    {
        System.out.println("Использовать матрицу весов по умолчанию?");
        Scanner in = new Scanner(System.in);
        if(in.nextLine().equalsIgnoreCase("да"))
        {
            return;
        }
        ArrayList<ArrayList<Integer>> matrixWeights = new ArrayList<>();
        String fName = "C:\\Users\\Ник\\Desktop\\Учеба в урфу\\Программирование\\MatrixWeight.txt";
        System.out.println("Использовать путь файла весов по умолчанию?");
        System.out.println("Путь: " + fName);
        if(in.nextLine().equalsIgnoreCase("нет"))
        {
            System.out.println("Введите путь к файлу");
            fName = in.nextLine();
        }
        File fIn = new File(fName);
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader(fIn), 1024);
            String str;
            while((str = br.readLine())!=null) {
                matrixWeights.add(new ArrayList<>());
                for (String strin : str.split(","))
                {
                    matrixWeights.get(matrixWeights.size()-1)
                                .add(Integer.parseInt(strin));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            br.close();
        }
        int[][] weights = new int[matrixWeights.size()][matrixWeights.get(0).size()];
        for(int i = 0; i < weights.length; i++)
        {
            weights[i] = Arrays.stream(matrixWeights.get(i).toArray()).mapToInt(x->(int)x).toArray();
        }
        System.out.println("Матрица весов:");
        matrixWeight = weights;
        for (int[] ints : weights) {
            System.out.println(Arrays.toString(ints));
        }

    }
}
