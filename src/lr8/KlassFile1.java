package lr8;

import java.io.File;

public class KlassFile1 {
    public static void main(String[] args)
    {
        try
        {
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if(f1.exists())
            {
                System.out.println("Создан");
                System.out.println("Полный путь:  " + f1.getAbsolutePath());
            }
            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь:  " + f2.getAbsolutePath());

            File f3 = new File("E:\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь:  " + f3.getAbsolutePath());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
