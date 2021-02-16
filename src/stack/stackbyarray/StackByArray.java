package stack.stackbyarray;

public class StackByArray {
    int arr[];
    int topOfStack;
    public StackByArray(int size){
        arr = new int[size];
        topOfStack = -1;
    }
    //To check stack is empty or not
    public boolean isEmpty(){
        return topOfStack == -1;
    }
    /**
     * pushElement:- It will insert a value in stack
     * @param data
     *
     */

    public void pushElement(int data){
        if(topOfStack != arr.length-1) {
            arr[topOfStack + 1] = data;
            topOfStack++;
            System.out.println(data + " is push");
        }
        else{
            System.out.println("Stack is Overflow");
        }
    }

    /**
     * popElement:- It will pop(delete) the value from last in.
     *
     */

    public void popElement(){
        if(!isEmpty()) {
            int delete = arr[topOfStack];
            System.out.println(delete + " is pop.");
            topOfStack--;
        }
        else{
            System.out.println("Stack is underflow");
        }
    }

    /**
     * peek:- It will return the last value(i.e is first from top) of the stack
     */

    public int peek(){
        if(isEmpty()){
            //System.out.println("Stack is Underflow");
            return -1;
        }
        else {
            return arr[topOfStack];
        }
    }

    //Display The stack
    public void display(){
        System.out.println("Values: ");
        for(int i = topOfStack; i>-1; i--)
        {
            System.out.println(arr[i]);

        }
    }

}
