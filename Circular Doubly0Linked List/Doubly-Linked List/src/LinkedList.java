public class LinkedList {
    
    Node start;
    Node current;

    LinkedList()
    {
        start = new Node();
        start.setNext(start);
        start.setPrev(start);
    }

    public void addNext(int data){
        Node temp = new Node();
        temp.setData(data);

        if (start == start.getNext())
        {
            temp.setPrev(start);
            temp.setNext(start);
            start.setNext(temp);
            start.setPrev(temp);
        }
        else
        {

            temp.setNext(start.getNext());
            temp.setPrev(start);
            temp.getNext().setPrev(temp);
            start.setNext(temp);
        }
       



    }

    // public void add_to_tail(int data){

    //     Node temp = new Node();
    //     temp.setData(data);
    //     if (tail.getNext() == null)
    //     {
    //         temp.setPrev(tail);
    //         temp.setNext(head);
    //         tail.setNext(temp);
    //         head.setPrev(temp);
    //     }

    //     else
    //     {
    //         temp.setNext(tail.getNext());
    //         temp.setPrev(tail);
    //         temp.getNext().setPrev(temp);
    //         tail.setNext(temp);
    //     }

    // }

    // public void next()
    // {
    //     if (current.getNext()!= null)
    //     {
    //         current = current.getNext();
    //     }
    //     else
    //     {
    //         System.out.println("ERROR! Cannot get the next node");
    //     }
    // }

    // public void prev()
    // {
    //     if (current.getPrev()!= null)
    //     {
    //         current = current.getPrev();
    //     }
    //     else
    //     {
    //         System.out.println("ERROR! Cannot get the previous node");
    //     }
    // }

    // public void add_to_current(int data)
    // {

    //     Node temp = new Node();
    //     temp.setData(data);
    //     temp.setNext(current);
    //     temp.setPrev(current.getPrev());
    //     temp.getPrev().setNext(temp);
    //     temp.getNext().setPrev(temp);
    // }   

    // public void showLinkedList()
    // {
    //     current = head;
    //     while (current != null)
    //     {
    //         System.out.println(current.getData());
    //         current = current.getPrev();
    //     }
    //     current = tail;
        
    // }

    // public int showCurrent()
    // {
    //     return current.getData();
    // }

    }

