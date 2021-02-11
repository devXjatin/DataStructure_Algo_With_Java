package linkedlist.doublylinkedlist;

public class doublyLinkedList {
    Node head;
    public doublyLinkedList(){
        head = null;
    }

    //Insert a node
    public void insert(Node newNode){
        if(head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;
        }
    }


}