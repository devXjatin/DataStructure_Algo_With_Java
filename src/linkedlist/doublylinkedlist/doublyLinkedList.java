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

    //Insertion a Node At beginning

    public void insertAtBeginning(Node newNode){
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    //Traverse
    public void traverseLinkedList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();      //for next line
    }

    //Delete At beginning

    public void deleteAtBeginning(){
        head = head.next;
        head.previous = null;
    }

    //Delete From End

    public void deleteFromEnd(){
        Node temp = head;
        Node pre = null;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        assert pre != null;
        pre.next = null;
        temp.previous = null;

    }

}
