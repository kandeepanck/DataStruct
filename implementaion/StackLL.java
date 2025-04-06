package implementaion;

public class StackLL {
    Node top;
    int size;

    // to get the top of the stack element
    public int Top() {
        return top.data;
    }

    // to remove the top element
    public void Pop() {
        Node temp=top;
        top = top.next;
        temp=null;
        size -= 1;
    }

    // to add a new value in the stack
    public void Push(int val) {
        Node temp = new Node(val);
        temp.next = top;
        top = temp;
        size += 1;
    }

    // to get the size of the stack
    public int Size() {
        return size;
    }
}
