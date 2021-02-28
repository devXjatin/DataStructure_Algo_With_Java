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
            System.out.println(topOfStack.data+" is Inserted.");
        }
        else{
            newnode.next = topOfStack;
            topOfStack = newnode;
            System.out.println(topOfStack.data+" is Inserted.");
        }
    }//end of the method.

    /**
     * deletion of value in stack.
     */
    public void popElement(){
        if(isEmpty()){
            System.out.println("Stack Is UnderFlow.");
        }
        else{
            Node temp = topOfStack;
            temp = temp.next;
            System.out.println(topOfStack.data+" is pop");
            topOfStack.next = null;
            topOfStack = temp;
        }
    }//end of the method

    /**
     * Display Stack or Print the value of stack.
     */
    public void displayStack(){
        Node temp = topOfStack;
        if(isEmpty()){
            System.out.println("Stack is UnderFlow");
        }
        else {
            System.out.println("Value In Stack: ");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }//end of while loop
            System.out.println();   //for next line
        }
    }//end of the method
    /**
     * return the top value in the stack.
     */
    public int peekStack(){
        return topOfStack.data;
    }//end of the method
}
