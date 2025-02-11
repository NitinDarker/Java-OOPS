/*
 * Q. 2. Write a program in java to implement the stack with following operations:
a. Initialized the Stack using constructor by passing size as an argument.
b. IsEmpty to check whether the stack is empty or not as private
member
c. IsFull to check whether the stack is FULL or not as private member
d. TOP to return the element at the top
e. Push
f. Pop
 */

class Stack {
    private final int size; // Size of stack array
    private int []data; // Array to initialize a stack
    private int top; // To store the top index of stack array

    Stack(int size) {
        data = new int[size];
        this.size = size;
        top = -1;
    }

    boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }

    boolean isFull() {
        if (top == size) return true;
        return false;
    }

    int top() {
        return data[top];
    }

    void push(int val) {
        if (isFull()) {
            System.out.println("Cannot push! Stack is full!");
            return;
        }
        data[top] = val;
        top++;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Cannot pop! Stack is empty!");
            return -1;
        }
        int val = data[top];
        top--;
        return val;
    }
}

