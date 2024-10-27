class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedListInsert {

    private static Node createCircularLinkedList(int... values) {
        Node head = null;
        Node tail = null;

        for (int value : values) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head; // Point to itself for circularity
            } else {
                tail.next = newNode;
                tail = newNode;
                newNode.next = head; // Point back to the head for circularity
            }
        }

        return head;
    }

    private static void printCircularLinkedList(Node head) {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println(); // Move to the next line after printing the list
    }

    public static Node insertSorted(Node head, int data){
        if(head == null){
            Node temp = new Node(data);
            head = temp;
            head.next = head;
            
            return head;
        }

        if(head.data > data){
            Node temp = new Node(data);

            temp.next = head;
            Node curr = head;
            head = temp;
            temp = temp.next.next;
            while(temp.next != curr){
                temp = temp.next;
            }

            temp.next = head;

            return head;
        }
        
        Node curr = head;
        Node prev = null;
        while(curr.data <= data){
            prev = curr;
            curr = curr.next;
        }
        
        Node temp = new Node(data);
        
        prev.next = temp;
        temp.next = curr;
        
        return head;
    }

    public static void main(String[] args) {
        Node head = createCircularLinkedList(-15, -9 ,-6, 5, 7, 14);

        // Print circular linked list
        System.out.println("Circular Linked List:");
        printCircularLinkedList(head);

        int data = -19;
        Node res = insertSorted(head, data);
        System.out.println("After inserting : ");
        printCircularLinkedList(res);
    }
}
