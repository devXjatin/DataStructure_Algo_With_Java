package questions;

public class QueuePalindrome {
    int begin;
    int top;
    char[] charsQueue;
    public QueuePalindrome(){ }

    public QueuePalindrome(int size){
        charsQueue = new char[size];
        top = begin = -1;
    }

    /**
     * To check queue is full or not.
     */
    public boolean isFull(){
        return top == charsQueue.length-1;
    }//end of the method

    /**
     * To check queue is empty.
     */
    public boolean isEmpty(){
        return top == -1;
    }// end of the method

    /**
     * Insert a character in queue.
     */
    public void enqueueCharacter(char character){
        if(isFull()){
            System.out.println("Queue is Full.");
        }
        else{
            if(begin == -1){
                charsQueue[begin+1] = character;
                begin++;
                top++;
            }
            else{
                charsQueue[top+1] = character;
                top++;
            }
        }
    }//end of the method

    /**
     * Delete the character in the Queue.
     */
    public char dequeueCharacter(){
        char delete = charsQueue[begin];
        //System.out.println(charsQueue[begin]+" is deleted.");
        charsQueue[begin] = 0;
        begin++;
        return delete;
    }// end of the method

    /**
     * Return the character which is last in the queue.
     */
    public char peekCharacter(){
        return charsQueue[top];
    }
    public void display(){
        for (int i = begin; i <=top ; i++) {
            System.out.print(charsQueue[i]);
        }
        System.out.println();
    }
}
