package lr10.Task1;

import lr10.Primer1_4.CreateXMLFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class XMLFIle {
    public static class Animal
    {
        private String name;
        private int age;
        private String kind;
        public Animal(String name, int age, String kind)
        {
            this.age = age;
            this.kind = kind;
            this.name = name;
        }

        public String getKind() {
            return kind;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File f1 = new File("src/lr10/Task1/example.xml");
        if(!f1.exists())
        {
            CreateNewXMLFile(f1);
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
        switch (choice)
        {
            case 1:
                AddNewAnimal(in, f1);
                break;
            case 2:
                FindAnimal(in, f1);
                break;
            case 3:
                DeleteAnimal(in, f1);
            default:
                break;
        }
    }

    private static void CreateNewXMLFile(File f1) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("pets");
            doc.appendChild(rootElement);
            doc.getDocumentElement().normalize();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new StreamResult(f1);
            transformer.transform(source, result);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    private static void DeleteAnimal(Scanner in, File f1) {
        try {
            System.out.println("Write the pets name");
            in.nextLine();
            String name = in.nextLine();
            System.out.println("Write the pets age");
            String age = Integer.toString(in.nextInt());
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(f1);
            NodeList nodeList = doc.getElementsByTagName("pet");
            for(int i = 0; i < nodeList.getLength(); i++)
            {
                Element pet = (Element)(nodeList.item(i));
                String name1 = pet.getElementsByTagName("name").item(0).getTextContent();
                String age1 = pet.getElementsByTagName("age").item(0).getTextContent();
                String kind = pet.getElementsByTagName("kind").item(0).getTextContent();
                if(name1.equalsIgnoreCase(name)&& age.equalsIgnoreCase(age1))
                {
                    Node parentNode = pet.getParentNode();
                    parentNode.removeChild(nodeList.item(i));
                    i--;
                    TransformDoc(f1, doc);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("++");
        }

    }

    private static void FindAnimal(Scanner in, File f1) {
        try {
            System.out.println("Write the pets name");
            in.nextLine();
            String name = in.nextLine();
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(f1);
            NodeList nodeList = doc.getElementsByTagName("pet");
            for(int i = 0; i < nodeList.getLength(); i++)
            {
                Element pet = (Element)(nodeList.item(i));
                String name1 = pet.getElementsByTagName("name").item(0).getTextContent();
                String age = pet.getElementsByTagName("age").item(0).getTextContent();
                String kind = pet.getElementsByTagName("kind").item(0).getTextContent();
                if(name1.equalsIgnoreCase(name))
                {
                    System.out.println("The pets name is " + name1);
                    System.out.println("The pets age is " + age);
                    System.out.println("The pets kind is " + kind);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    private static void AddNewAnimal(Scanner in, File f1) {
        System.out.println("write pets name");
        in.nextLine();
        var name = in.nextLine();
        System.out.println("write pets age");
        var age = in.nextInt();
        System.out.println("write pets kind");
        in.nextLine();
        var kind = in.nextLine();
        Animal an = new Animal(name, age, kind);

        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(f1);
            doc.normalize();
            var rootElement = doc.getDocumentElement();
            rootElement.normalize();
            Element pet = doc.createElement("pet");
            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode(an.name));
            pet.appendChild(name1);

            Element age1 = doc.createElement("age");
            age1.appendChild(doc.createTextNode(Integer.toString(an.age)));
            pet.appendChild(age1);
            Element kind1 = doc.createElement("kind");
            kind1.appendChild(doc.createTextNode(an.kind));
            pet.appendChild(kind1);
            rootElement.appendChild(pet);
            rootElement.normalize();
            TransformDoc(f1, doc);

        }
        catch (Exception pce)
        {
            pce.printStackTrace();
        }
    }
    public static void TransformDoc(File f1, Document doc)
    {
        try {
            doc.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(f1);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
