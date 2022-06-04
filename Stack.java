public class Stack implements IStack {

    private int[] arr;
    private int top;
    private int capacity;


    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    @Override
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    @Override
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Removing " + peek());
        return arr[top--];
    }

    @Override
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
        return -1;
    }

    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public void isStackFull() {
        if(isFull()) {
            capacity = capacity * 2;
        }
    }
}
