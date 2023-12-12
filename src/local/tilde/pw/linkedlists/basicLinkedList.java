package local.tilde.pw.linkedlists;

public class basicLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(5); // n1 -> head
        Node n2 = new Node(4);
        Node n3 = new Node(3);
        Node n4 = new Node(9);
        Node n5 = new Node(7); // n5 -> tail
        
        //Establishing the relation between nodes 
        //daat: 5  4  3  9  7
        //System.out.println(n1.next);
        n1.next = n2;   // 5 -> 4  3  9  7
        n2.next = n3;   // 5 -> 4 -> 3  9  7
        n3.next = n4;   // 5 -> 4-> 3 -> 9  7
        n4.next = n5;   // 5 -> 4> 3 -> 9 -> 7
        
        System.out.println("Linked List:");
        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);
        System.out.println(n4.data);
        System.out.println(n5.data);
        
        //accessing data of n2 using n1
        System.out.println("accessing data of n2 using n1");
        System.out.println(n1.next.data); //15

        
    }
}
