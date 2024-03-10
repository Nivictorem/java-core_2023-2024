package lr9.Task5.FromHead;

import lr9.Task4.Node;

public class FirstVariant {
    public static void main(String[] args) {
        Node node0 = new Node(null, 0);
        Node node1 = new Node(null, 1);
        Node node2 = new Node(null, 2);
        Node node3 = new Node(null, 3);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        Node ref = node0;
        while (ref!=null)
        {
            System.out.println(ref.value);
            ref = ref.next;
        }

    }
}
