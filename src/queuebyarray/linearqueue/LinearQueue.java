package queuebyarray.linearqueue;

public class LinearQueue {
    int begin;
    int top;
    int sizeOfArray;
    int[] arr;
    int sizeOfQueue;

    public LinearQueue(int sizeOfArray){
        arr = new int[sizeOfArray];
        this.sizeOfArray = sizeOfArray;
        begin = -1;
        top = -1;
    }//end of the Constructor

    /**
     * to check Queue is full or not.
     * @return
     */
    public boolean isFull(){
        return top == sizeOfArray-1;
    }// end of the method

    /**
     * to check queue is empty.
     * @return
     */
    public boolean isEmpty(){
        return top == -1;
    }// end of the method

    /**
     * Insert the value in Queue.
     * @param data
     */
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is Full..");
        }
        else{
            if(begin == -1){
                arr[begin+1] = data;
                begin++;
                top++;
                System.out.println(arr[begin]+" is Inserted.");
                sizeOfQueue++;
            }
            else{
                arr[top+1] = data;
                top++;
                sizeOfQueue++;
                System.out.println(arr[top]+" is Inserted..");

            }
        }
    }// end of the method

    /**
     * To delete the data in the queue.
     */
    public void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty..");
        }
        else {
            System.out.println(arr[begin]+" is Deleted.");
            arr[begin] = 0;
            begin++;
            sizeOfQueue--;
        }
    }// end of the method

    /**
     * To Display the data of the Queue.
     */
    public void display(){
        System.out.println("Elements in a Queue: ");
        for (int i = begin; i <= top; i++) {
            System.out.print(arr[i]+" \t");
        }
        System.out.println();
        System.out.println("Size Of Queue: "+sizeOfQueue);
        System.out.println();   //for next line after completing the loop.
    }// end of the method

    /**
     * return the top value in queue.
     * @return
     */
    public int peek(){
        return arr[top];
    }//end of the method
}
