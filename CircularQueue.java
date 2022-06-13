// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class CircularQueue {
    int front = -1;
    int rear = -1;
    int[] arr = new int[10];
    public static void main(String[] args) {
       CircularQueue q = new CircularQueue();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
              q.display();
       q.remove();
       q.display();
    }
    
    boolean isFull() {
        if(front == 0 && rear == 9) {
            return true;
        } 
        if(front == rear+1) {
            return true;
        } 
        return false;
    }
    
    boolean isEmpty() {
        if(front == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    void add(int num) {
        if(isFull()) {
            System.out.println("Full!");
        } else {
            if(front == -1) {
                front = 0;
            }
            rear = (rear+1) % 10;
            arr[rear] = num;
            System.out.println("added "+num);
        }
    }
    
    void remove() {
        int element;
        if(isEmpty()) {
            System.out.println("Empty!");
        }
        else {
            element = arr[front];
            if(front == rear) {
                front = 1;
                rear = -1;
            } else {
                front = (front+1)%10;
            }
        System.out.println("removed "+element);
        }
    }
    
    void display() {
        int i;
        if(isEmpty()) {
            System.out.println("Empty!");
        } else {
            for( i=front;i!=rear+1;i=(i+1)%10) {
                System.out.print(" "+arr[i]+" ");
                System.out.println(arr[i]);
            }
        }
    }
}