package local.tilde.pw.linkedlists;

public class lengthOfList {
    public static int lengthList(Node head) {
        int countList = 0;
        while (head != null) { // method to count length of total list in the linked list
            countList++;
            head = head.next;
        }
        return countList;
    }

    public static void main(String[] args) {
        Node n1 = new Node(44);
        Node n2 = new Node(45);
        Node n3 = new Node(37);
        Node n4 = new Node(74);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int countOfList = lengthList(n1);
        System.out.println("Number of list in Linked List: "+countOfList);
    }
}
