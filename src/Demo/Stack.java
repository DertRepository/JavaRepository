package Demo;

public class Stack {
    int[] stck = new int[10];
    int tos;

    //    Initialize top-of-stack
    Stack() {
        tos = -1;
    }

    //  Push item onto stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Demo.Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    //    Pop item from stack
    int pop() {
        if (tos < 0) {
            System.out.println("Demo.Stack Underflow");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
