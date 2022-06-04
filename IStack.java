public interface IStack {
    public void push(int x);
    public int pop();
    public int peek();
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public void isStackFull();
}
