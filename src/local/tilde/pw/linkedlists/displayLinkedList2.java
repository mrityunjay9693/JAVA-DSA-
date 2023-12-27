//Here, to display linked list we will define a function and pass head of Node as an argument and 
//displaying the list using the function. 
package local.tilde.pw.linkedlists;

public class displayLinkedList2 {

    public static void viewNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node data1 = new Node(1); // head node
        Node data2 = new Node(2);
        Node data3 = new Node(8);
        Node data4 = new Node(10);

        data1.next=data2;
        data2.next=data3;
        data3.next=data4;

        viewNode(data1);
    }
}
