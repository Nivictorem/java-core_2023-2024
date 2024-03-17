package lr10.Task2;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileWriter;

public class JsonParser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File f1 = new File("src/lr10/Task2/example.json");
        if(!f1.exists())
        {
            CreateNewJsonFile(f1);
        }
        int choice = 0;
        do {
            System.out.println("Choose the function\nif you want add new animal write 1\n" +
                    "if you want find animal by breed write 2\nif you want delete animal write 3\n" +
                    "if you want to leave write 4");
            choice = in.nextInt();
            if(choice == 4)
                return;
        } while (choice < 0 || choice > 4);
        try
        {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(f1));
            JSONObject jsonObject = (JSONObject) obj;
            switch (choice)
            {
                case 1:
                    AddNewAnimal(in, f1, jsonObject);
                    break;
                case 2:
                    FindAnimal(in, f1, jsonObject);
                    break;
                case 3:
                    DeleteAnimal(in, f1, jsonObject);
                default:
                    break;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private static void CreateNewJsonFile(File f1) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        library.put("pets", books);

        try (FileWriter file = new FileWriter(f1))
        {
            file.write(library.toJSONString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void FindAnimal(Scanner in, File f1, JSONObject jsonObject) {
        System.out.println("write pets name");
        in.nextLine();
        var name = in.nextLine();
        System.out.println("write pets age");
        var age = in.nextInt();
        JSONArray jsonArray = (JSONArray) jsonObject.get("pets");
        jsonArray.stream().filter(pet -> pet instanceof JSONObject)
                .map(pet -> (JSONObject)pet)
                .filter(pet -> name.equals(((JSONObject)pet).get("name")) &&
                        Integer.toString(age).equals(((JSONObject)pet).get("age")) )
                .forEach(pet ->
                {
                    System.out.println("The pets name is " + ((JSONObject)pet).get("name"));
                    System.out.println("The pets age is " + ((JSONObject)pet).get("age"));
                    System.out.println("The pets kind is " + ((JSONObject)pet).get("kind"));
                });
    }

    private static void AddNewAnimal(Scanner in, File f1, JSONObject jsonObject) {
        System.out.println("write pets name");
        in.nextLine();
        var name = in.nextLine();
        System.out.println("write pets age");
        var age = in.nextInt();
        System.out.println("write pets kind");
        in.nextLine();
        var kind = in.nextLine();
        JSONArray jsonArray = (JSONArray) jsonObject.get("pets");
        JSONObject pet = new JSONObject();
        pet.put("name", name);
        pet.put("age", Integer.toString(age));
        pet.put("kind", kind);
        jsonArray.add(pet);
        try (FileWriter file = new FileWriter(f1))
        {
            file.write(jsonObject.toJSONString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void DeleteAnimal(Scanner in, File f1, JSONObject jsonObject) {
        System.out.println("write pets name");
        in.nextLine();
        var name = in.nextLine();
        System.out.println("write pets age");
        var age = in.nextInt();
        JSONArray jsonArray = (JSONArray) jsonObject.get("pets");
        List<Object> jsonList = jsonArray.stream().filter(pet -> pet instanceof JSONObject)
                .map(pet -> (JSONObject)pet)
                .filter(pet -> name.equals(((JSONObject)pet).get("name")) &&
                        Integer.toString(age).equals(((JSONObject)pet).get("age")) )
                .toList();
        if(!jsonList.isEmpty())
        {
            JSONObject jsonObject1 = (JSONObject) jsonList.get(0);
            jsonArray.remove(jsonObject1);
            try (FileWriter file = new FileWriter(f1))
            {
                file.write(jsonObject.toJSONString());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
