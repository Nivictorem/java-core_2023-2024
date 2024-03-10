package lr9.Task8.Circle;
import lr9.Task5.Node;
import lr9.Task7.WithArrayList;

public class First {
    public static void main(String[] args) {
        Node node = CreateHead(10);
        //node = Addfirst(node);
        //AddLast(node);
        //Insert(5, node, -11);
//        System.out.println(toString(node));
//        node = RemoveFirst(node);
//        System.out.println(toString(node));
//        RemoveLast(node);
//        System.out.println(toString(node));
        Remove(5, node);
        System.out.println(toString(node));
    }
    public static Node CreateHead(int N)
    {
        Node node = new Node(null, N);
        for(int i = N-1; i >0; i--)
        {
            node = new Node(node, i);
        }
        return node;
    }
    public static Node CreateTail(int N)
    {
        Node node = null;
        for(int i = 1; i <= N; i++)
        {
            node = new Node(node, i);
        }
        return node;
    }
    public static String toString(Node node)
    {
        String str = "";
        Node ref = node;
        while (ref!=null)
        {
            str = str + ref.value;
            ref = ref.next;
        }
        return str;
    }
    public static Node Addfirst(Node node)
    {
        return new Node(node, -1);
    }
    public static void AddLast(Node node)
    {
        Node ref = node;
        while(ref!= null)
        {
            if(ref.next == null)
            {
                ref.next = new Node(null, -1);
                break;
            }
            ref = ref.next;
        }
    }
    public static void Insert(int index, Node node, int num)
    {
        Node ref = node;
        int count = 0;
        while(ref!= null)
        {
            if(count == index)
            {
                ref.value = num;
            }
            count++;
            ref = ref.next;
        }
    }
    public static void RemoveLast(Node node)
    {
        Node ref = node;
        while(ref!= null)
        {
            if(ref.next.next == null)
            {
                ref.next = null;
                break;
            }
            ref = ref.next;
        }
    }
    public static Node RemoveFirst(Node node)
    {
        return node.next;
    }
    public static void Remove(int index, Node node)
    {
        Node ref = node;
        int count = 0;
        while(ref!= null)
        {
            if(count == index - 1)
            {
                ref.next = ref.next.next;
                break;
            }
            count++;
            ref = ref.next;
        }
    }
}
