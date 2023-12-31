public class CustomStack {
    int[] stack;
    int top;
    int size;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        top = -1;
        size = maxSize;
    }

    public void AddElement(int x){
        if(top == size-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = x;
    }
    public void RemoveElement(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }
    public int TopElement(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public boolean IsEmpty(){
        return top == -1;
    }
    public boolean IsFull(){
        return top == size-1;
    }
}