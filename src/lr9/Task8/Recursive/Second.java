package lr9.Task8.Recursive;
import lr9.Task5.Node;
public class Second {
    public static void main(String[] args) {
        Node node = CreateTail(5, null);
        System.out.println(toString(node));
    }
    public static Node CreateHead(int N)
    {
        Node node = null;
        if(N == 0)
            node = new Node(null, N);
        else
            node = new Node(CreateHead(N-1), N);
        return node;
    }
    public static Node CreateTail(int N, Node node)
    {
        if(N == 0)
            node = new Node(null, N);
        else
            node = new Node(CreateTail(N-1, node), N);
        return node;
    }
    public static String toString(Node node)
    {
        Node ref = node;
        if(ref.next == null)
            return Integer.toString(node.value);
        else
            return Integer.toString(node.value) + toString(ref.next);
    }
}
