// List is displayed using recurssion function
package local.tilde.pw.linkedlists;

public class displayList3 {
    public static void displayRecursive(Node head) {
        if(head==null)
            return;

        System.out.print(head.data + " ");
        displayRecursive(head.next);
    }

    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(9);
        Node n3 = new Node(6);
        Node n4 = new Node(10);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("List:");
        displayRecursive(n1);
        System.out.println();
    }
}
