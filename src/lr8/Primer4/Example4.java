package lr8.Primer4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example4 {

    public static ArrayList<Integer> readAllByByte(InputStream in) throws IOException
    {
        ArrayList<Integer> ArrayInt = new ArrayList<Integer>();
        while (true)
        {
            int oneByte = in.read();
            if(oneByte != -1)
            {
                ArrayInt.add(oneByte);
            }
            else
            {
                break;
            }
        }
        return ArrayInt;
    }
    public static void WriteFromOutput(OutputStream out, ArrayList<Integer> ArrayInt) throws IOException
    {
        var in = new Scanner(System.in);
        DataOutputStream toFile = new DataOutputStream(out);
        for (int i:ArrayInt)
        {
            toFile.writeInt(i);
        }
        toFile.close();
    }

    public static ArrayList<Integer> GetValueFromKeybouard()
    {
        ArrayList<Integer> ArrayInt = new ArrayList<Integer>();
        while (true)
        {
            var in = new Scanner(System.in);
            var a = in.nextInt();
            if(a == -1)
            {
                break;
            }
            ArrayInt.add(a);
        }
        return ArrayInt;
    }
    public static void main(String[] args) throws IOException {

        try
        {
            File f1 = new File("C:\\My");
            if(f1.exists())
            {
                System.out.println("Создан");
                System.out.println("Полный путь:  " + f1.getAbsolutePath());
                f1 = new File("C:\\My\\numIsh.txt");
            }
            else
            {
                f1.mkdirs();
                f1 = new File("C:\\My\\numIsh.txt");
                f1.createNewFile();
            }
            OutputStream toFile = new FileOutputStream(f1);
            WriteFromOutput(toFile, GetValueFromKeybouard());
            File f2 = new File("C:\\My\\numRez.txt");
            if(f2.exists())
            {
                System.out.println("Создан");
                System.out.println("Полный путь:  " + f1.getAbsolutePath());

            }
            else
            {
                f2.createNewFile();
            }
            InputStream inFIle = new FileInputStream(f1);
            toFile = new FileOutputStream(f2);
            WriteFromOutput(toFile, readAllByByte(inFIle));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
