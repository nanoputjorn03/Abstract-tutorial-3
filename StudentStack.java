// ADT tutorial 3 Tat Putjorn 672115024

public class StudentStack {
    private Student[] stack;
    private int top;
    private int capacity;

    public StudentStack(int capacity) {
        this.capacity = capacity;
        this.stack = new Student[capacity];
        this.top = -1; 
    }

    public void push(Student s) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            top++;
            stack[top] = s;
            System.out.println("Element " + s + " is pushed into the queue");
        }
    }

    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return null;
        } else {
            Student popped = stack[top];
            stack[top] = null;
            top--;
            System.out.println("Popped " + popped);
            return popped;
        }
    }

    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return null;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public int size() {
        return top + 1;
    }
}
