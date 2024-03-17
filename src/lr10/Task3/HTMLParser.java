package lr10.Task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class HTMLParser {
    public static void main(String[] args) throws IOException{
        String url = "http://fat.urfu.ru/indexxx.html";
        try
        {
            Document doc = null;
            try
            {
                doc = Jsoup.connect(url).get();
            }
            catch (IOException e)
            {
                System.out.println(e);
                try {
                    doc = Jsoup.connect(url).get();
                }
                catch (IOException e2)
                {
                    return;
                }
            }
            Elements newsParent = doc.select("body > table > tbody > tr > td > div" +
                    " > table > tbody > tr:nth-child(5) > td:nth-child(3) > " +
                    "table > tbody > tr > td:nth-child(1)");

            LinkedList<String> strings = new LinkedList<>();

            for (int i = 3; i < 20; i++)
            {
                if(!(i%2 == 0))
                {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    String str =    "Тема : "
                            + ((Element) nodes.get(i)).getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0);
                    str = str + "\n" + "Дата : "
                            + ((Element) nodes.get(i)).getElementsByClass("blockdate")
                            .get(0).childNodes().get(0);
                    strings.add(str);
                }
            }
            WriteTheInfo(strings);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void WriteTheInfo(LinkedList<String> strings) throws IOException
    {
        String fNameOut = "src/lr10/Task3/example.txt";
        File fout = new File(fNameOut);
        if(!fout.exists())
            fout.createNewFile();
        BufferedWriter out = null;
        try
        {
            out = new BufferedWriter(new FileWriter(fout), 1024);
            int i = 1;
            for (String str : strings)
            {
                out.write(str);
                out.newLine();
            }
        } catch (IOException e)
        {}
        finally {
            out.flush();
            out.close();
        }
    }
}
