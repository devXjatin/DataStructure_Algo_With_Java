//WAP to check string is palindrome or not by using stack and queue.
package questions;

public class StackPalindrome {
    int top;
    char [] chars;
    int sizeOfString;
    public StackPalindrome(){
    }

    public StackPalindrome(int size){
        chars = new char[size];
        sizeOfString = size;
        top = -1;
    }
    /**
     * To check stack is full or not.
     */
    public boolean isFull(){
        return top == chars.length;
    }

    /**
     * Insert a character in it.
     */
    public void pushCharacter(char character){
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else{
            chars[top+1] = character;
            top++;
        }
    }// end of the method

    /**
     * Delete the character in the stack.
     */
    public char popCharacter(){
        char delete = chars[top];
        //System.out.println(chars[top]+" is deleted.");
        chars[top] = 0;
        top--;
        return delete;
    }// end of the method.

    /**
     * return top character of the stack
     */
    public char peekCharacter(){
        return chars[top];
    }//end of the method

    public void displayStack(){
        for (int i = top; i > -1 ; i--) {
            System.out.print(chars[i]);
        }
        //System.out.println("stack"+sizeOfString);
        System.out.println();
    }
}
