package lr8.Task3;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        String fName = "C:\\Users\\Ник\\Desktop\\Учеба в урфу\\Программирование\\3.txt";
        String fNameOut = "C:\\Users\\Ник\\Desktop\\Учеба в урфу\\Программирование\\4.txt";
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
            int i = 1;
            String str;
            while((str = br.readLine())!=null)
            {
                str = str.replaceAll("\\pP", "");
                out.write(i + ": ");
                int j = 0;
                for (var s : str.split(" "))
                {
                    if(!s.matches("^(?ui:[аеёиоуыэюя]).*") && s.length() > 0)
                    {
                        out.write(s + " ");
                        j++;
                    }
                }
                out.write(" number of words is " + j);
                out.newLine();
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
