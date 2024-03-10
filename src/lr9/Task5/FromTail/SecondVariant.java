package lr9.Task5.FromTail;

import lr9.Task5.Node;

import java.util.Stack;

public class SecondVariant {
    public static void main(String[] args) {
        Node head = null;
        for(int i =9; i >=0; i-- )
        {
            head = new Node(head, i);
        }
        Node ref = head;
        while (ref != null)
        {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }

}
