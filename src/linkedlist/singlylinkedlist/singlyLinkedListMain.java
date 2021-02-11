package linkedlist.singlylinkedlist;

public class singlyLinkedListMain {
    public static void main(String[] args) {
        singlyLinkedList obj = new singlyLinkedList();
        for (int i = 10; i < 50; i+=10) {
            obj.insert(new Node(i));
        }
      /*  obj.insert(new Node(10));
        obj.insert(new Node(20));
        obj.insert(new Node(30));
        obj.insert(new Node(40));*/
        System.out.println("Traverse Node: ");
        obj.traverseLinkedList();
        obj.insertAtBeginning(new Node(50));
        System.out.println("Insert A Node at Beginning: ");
        obj.traverseLinkedList();
        obj.insertAtSpecific(2, new Node(25));
        System.out.println("Insert A Node At specific Position: ");
        obj.traverseLinkedList();
        obj.deleteAtBeginning();
        System.out.println("Delete At Beginning: ");
        obj.traverseLinkedList();
        obj.deleteAtEnd();
        System.out.println("Delete At End: ");
        obj.traverseLinkedList();
        obj.deleteAtPosition(2);
        System.out.println("Delete At position: ");
        obj.traverseLinkedList();
    }
}
