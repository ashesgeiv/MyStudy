/**
 * Stack
 */
class Stack {
    int top = -1;
    int[] array;
    int num;

    Stack(int size) {
        this.array = new int[size];
        num = size;
    }

    void push(int Empty) {
        ++top;
        array[top] = Empty;
    }

    int pop() {
        top--;
        return array[top+1];
        
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(2);
        s1.push(5);
        s1.push(1);
        s1.push(7);
        s1.push(2);
        s1.push(8);
        s1.push(9);
        System.out.println(s1.pop());
    }
}
