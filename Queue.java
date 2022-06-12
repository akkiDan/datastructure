// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Queue {
    int front = -1;
    int rear = -1;
    int[] arr = new int[10];
    public static void main(String[] args) {
         Queue q = new Queue();
        //  q.push(2);
        //  q.push(3);
        //  q.push(4);
        //  q.push(5);
         q.pop();
         q.pop();
         q.printQueue();
         
    }
    
    void push(int num) {
        if(front != 9) {
        if(front == -1) {
           arr[++front] = num;
           rear++;
        } else {
            arr[++front] = num;
        }
        } else {
            System.out.println("Queue is full");
        }
    }
    
    void pop() {
        if(rear <= front) {
            System.out.println("poped "+arr[rear++]);
        } else {
            System.out.println("Queue is empty");
        }
    }
    
    void printQueue() {
         if(rear <= front) {
        for(int i=rear;i<= front;i++) {
            System.out.print(" "+arr[i]);
        }
         } else {
             System.out.println("Queue is empty");
         }
    }
}