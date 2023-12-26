// Using for loop
package local.tilde.pw.linkedlists;

public class displayingList {
    public static void main(String[] args) {
        Node n1 = new Node(5); // n1 -> head
        Node n2 = new Node(4);
        Node n3 = new Node(3);
        Node n4 = new Node(9);
        Node n5 = new Node(7); // n5 -> tail

        // Establishing the relation between nodes
        // daat: 5 4 3 9 7
        n1.next = n2; // 5 -> 4 3 9 7
        n2.next = n3; // 5 -> 4 -> 3 9 7
        n3.next = n4; // 5 -> 4-> 3 -> 9 7
        n4.next = n5; // 5 -> 4 -> 3 -> 9 -> 7

        System.out.println("List:");

        Node temp = n1;
        for (int i = 0; i < 5; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
