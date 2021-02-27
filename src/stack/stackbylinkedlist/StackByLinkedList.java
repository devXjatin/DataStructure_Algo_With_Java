package stack.stackbylinkedlist;

public class StackByLinkedList {
    Node topOfStack;

    public StackByLinkedList(){
        topOfStack = null;
    }//end of the constructor

    /**
     * to check stack is empty or not.
     */
    public boolean isEmpty(){
        return topOfStack == null;
    }// end of the method.

    /**
     * insertion of value in stack.
     */
    public void pushElement(Node newnode){
        if(isEmpty()){
            topOfStack = newnode;
        }
        else{
            newnode.next = topOfStack;
            topOfStack = newnode;
        }
    }//end of the method.

    /**
     * deletion of value in stack.
     */
    public void popElement(){
        Node temp = topOfStack;
        temp = temp.next;
        topOfStack.next = null;
        topOfStack = temp;
    }//end of the method
}
