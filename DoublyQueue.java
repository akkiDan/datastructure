// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class DoublyQueue {
    int front = -1;
    int rear = -1;
    int[] arr = new int[10];
    public static void main(String[] args) {
      DoublyQueue q = new DoublyQueue();
      q.pushFF(1);
      q.pushFF(2);
      q.pushFF(3);
      q.printQueue();
      q.popFR();
      q.popFR();
      q.printQueue();
      q.pushFR(5);
      q.pushFR(0);
      q.printQueue();
      q.popFR();
      q.printQueue();
    }
    
    void printQueue() {
        System.out.println();
        for(int i=rear;i<=front;i++) {
            System.out.print(" "+arr[i]);
        }
    }
    void pushFF(int num) {
        if(front == -1) {
            arr[++front] = num;
            rear++;
        } else {
            if(front <= 9) {
            arr[++front] = num;
            } else {
                System.out.print("Queue is full");
            }
        }
    }
    
    void pushFR(int num) {
        if(rear >= 0) {
            arr[--rear] = num;
        } else {
            System.out.println("Can not ente from rear");
        }
    }
    
    void popFF() {
        if(front>= rear) {
            System.out.println(" popped "+ arr[front--]);
        }
    }
    
    void popFR() {
        if(rear <= front && rear > -1) {
            System.out.println("Popped "+arr[rear++]);
        }
    }
}