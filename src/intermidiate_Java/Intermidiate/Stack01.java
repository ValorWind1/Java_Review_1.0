package intermidiate_Java.Intermidiate;

import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {

        // Stack01 = LIFO (last in first out ).

        Stack<String> stack1 = new Stack<String>();
        stack1.push("Bottom");
        printStack(stack1);
        stack1.push("Second");
        printStack(stack1);
        stack1.push("Third");
        printStack(stack1);

        stack1.pop();
        printStack(stack1);
        stack1.pop();
        printStack(stack1);
        stack1.pop();
        printStack(stack1);
    }
    private static void printStack(Stack<String> theStack){
        if(theStack.isEmpty()){ // check if stack is empty frist
            System.out.println("Stack is empty ");
        }else{
            System.out.printf("%s TOP\n",theStack);
        }
    }
}