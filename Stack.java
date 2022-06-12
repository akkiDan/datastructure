class Stack {
    int top = -1;
    int[] arr = new int[10];
    public static void main(String[] args) {
         Stack stack = new Stack();
         stack.push(9);
         stack.push(3);
         stack.push(5);
         stack.pop();
         stack.printStack();
    }
    
    void push(int num) {
        if(!isFull()) {
            arr[++top] = num; 
        } else {
            System.out.println("Stack is empty");
        }
    }
    
    void pop() {
        if(!isEmpty()) {
            System.out.println("Poped : "+arr[top]);
            top--;
        } else {
            System.out.println("Stack is empty");
        }
    }
    
    void printStack() {
        for(int i=0;i<=top;i++) {
            System.out.print(" "+arr[i]);
        }
    }
    
    boolean isFull() {
        return top == 9;
    }
    
    boolean isEmpty() {
        return top == -1;
    }
}