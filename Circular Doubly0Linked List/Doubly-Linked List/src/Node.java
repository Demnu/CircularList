public class Node {
    
    Node prev;
    Node next;
    int data;

    Node()
    {
        prev = null;
        next = null;
        data = 0;
    }

    Node (Node prevInput, Node nextInput, int dataInput)
    {
        prev = prevInput;
        next = nextInput;
        data = dataInput;
    }

    public Node getPrev(){
        return prev;
    }

    public Node getNext(){
        return next;
    }

    public int getData()
    {
        return data;
    }

    public void setPrev(Node temp){
        prev = temp;
    }

    public void setNext(Node temp){
        next = temp;
    }

    public void setData(int input){
        data = input;
    }
}
