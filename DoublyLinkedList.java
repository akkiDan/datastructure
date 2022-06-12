// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class DoublyLinkedList {
    Node head;
    Node trail;
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int num) {
            this.data = num;
        }
    }
    public static void main(String[] args) {
         DoublyLinkedList list = new DoublyLinkedList();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.printList();
         list.deleteHead();
         System.out.println("Head delete");
         list.printList();
         list.deleteEnd();
         list.printList();
         list.deleteAtMiddle(1);
         list.printList();
         
         }
    
    void add(int num) {
        Node node = new Node(num);
        if(head == null) {
            head = node;
            trail = node;
        } else {
            trail.next = node;
            Node cNode = trail;
            trail = trail.next;
            trail.prev = cNode;
            
            System.out.println("prev "+trail.prev.data);
        }
    }
    
    void deleteEnd() {
        Node cNode = head;
        while(cNode.next != null) {
            cNode = cNode.next;
        }
        Node pNode = cNode.prev;
        System.out.println("- "+cNode.data);  
        pNode.next = null;
    }
    
    void deleteAtMiddle(int index) {
        int i=0;
        Node cNode = head;
        while(cNode != null) {
            i++;
            cNode = cNode.next;
            if(index == i) {
                Node pNode = cNode.prev;
                pNode.next = cNode.next;
                pNode.next.prev = pNode;
            }
        }
    }
    
    void deleteHead() {
        if(head != null) {
            head = head.next;
            head.prev = null;
        }
    }
    void printList() {
        Node cNode = head;
        while(cNode != null) {
            System.out.println("-->"+cNode.data);
            cNode = cNode.next;
        }
    }
}