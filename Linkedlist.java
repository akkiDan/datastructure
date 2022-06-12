// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedList {
    Node head;
    Node trail;
    class Node {
        int data;
        Node next;
        Node(int num) {
            this.data = num;
        }
    }
    public static void main(String[] args) {
         LinkedList list = new LinkedList();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.printList();
         list.deleteFromHead();
         list.printList();
         list.deleteFromMeddle(1);
         list.printList();
         list.deleteFromEnd();
         list.printList();
    }
    
    void add(int num) {
        Node node = new Node(num);
        if(head == null) {
            head = node;
            trail = node;
        } else {
            trail.next = node;
            trail = trail.next;
        }
    }
    
    void printList() {
        Node cNode = head;
        while(cNode != null) {
            System.out.println("-->"+cNode.data);
            cNode = cNode.next;
        }
    }
    
    void deleteFromHead() {
        if(head != null) {
            head = head.next;
        }
    }
    
    void deleteFromEnd() {
        Node cNode = head;
        Node pNode = head;
        while(cNode.next != null) {
            pNode = cNode;
            cNode = cNode.next;
        }
        pNode.next = null;
    }
    
    void deleteFromMeddle(int index) {
        Node cNode = head;
        Node pNode = head;
        int i=0;
        while(cNode!= null) {
            pNode = cNode;
            cNode = cNode.next;
            i++;
            if(i == index) {
                pNode.next = cNode.next;
            }
        }
    }
}