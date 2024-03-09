package lr8.Task2;

import java.io.*;

public class Task2_main {
    public static void main(String[] args) throws IOException {
        String fName = "C:\\Users\\Ник\\Desktop\\Учеба в урфу\\Программирование\\1.txt";
        String fNameOut = "C:\\Users\\Ник\\Desktop\\Учеба в урфу\\Программирование\\2.txt";
        File fIn = new File(fName);
        File fout = new File(fNameOut);
        if(!fout.exists())
            fout.createNewFile();
        BufferedReader br = null;
        BufferedWriter out = null;
        try
        {
            br = new BufferedReader(new FileReader(fIn), 1024);
            out = new BufferedWriter(new FileWriter(fout), 1024);
            int i = 0;
            String str;
            while((str = br.readLine())!=null)
            {
                if(i==1)
                {
                    out.write(str);
                    out.newLine();
                }
                else if(i==2)
                {
                    for (var s : str.split(" "))
                    {
                        if(!s.contains("-"))
                        {
                            out.write(s + " ");
                        }
                    }
                    out.newLine();
                }
                i++;
            }
        } catch (IOException e)
        {}
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
