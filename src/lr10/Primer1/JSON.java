package lr10.Primer1;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.w3c.dom.Element;

import java.io.FileWriter;

public class JSON {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();


        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", 1869);

        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Мастер и Маргарита");
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter file = new FileWriter("src/lr10/Primer1/example-json.json"))
        {
            //FileWriter file = new FileWriter("src/lr10/Primer1/example-json.json");
            file.write(library.toJSONString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
