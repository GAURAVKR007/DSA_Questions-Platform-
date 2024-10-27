import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class CopyListWithRandomPointer{
     public Node copyRandomList(Node head) {
       if(head == null){
            return null;
        }
       
       HashMap<Node,Node> map = new HashMap<>();

       Node curr = head;

       while(curr != null){
           map.put(curr,new Node(curr.val));
           curr = curr.next;
       }

       curr = head;

       while(curr != null){
            Node newTempNode = map.get(curr);
            newTempNode.next = map.get(curr.next);
            newTempNode.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {
    // Create the original linked list with random pointers
    Node node7 = new Node(7);
    Node node13 = new Node(13);
    Node node11 = new Node(11);
    Node node10 = new Node(10);
    Node node1 = new Node(1);

    node7.next = node13;
    node13.random = node7;
    node13.next = node11;
    node11.random = node1;
    node11.next = node10;
    node10.random = node11;
    node10.next = node1;
    node1.random = node7;

    // Copy the linked list
    CopyListWithRandomPointer solution = new CopyListWithRandomPointer();
    Node copiedList = solution.copyRandomList(node7);

    // Check if the random pointers in the copied list point to nodes in the copied list
    Node copiedNode13 = copiedList;
    Node originalNode13 = node7;

    while (copiedNode13 != null) {
        if (copiedNode13.random != null) {
            System.out.println("Random pointer of node with val " + copiedNode13.val +
                    " points to a node with val " + copiedNode13.random.val +
                    " (expected: a node not in the copied list)");
        }
        
        copiedNode13 = copiedNode13.next;
        originalNode13 = originalNode13.next;
    }

    // If there are no print statements, the test passed
}

}