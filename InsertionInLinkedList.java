class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}

public class InsertionInLinkedList {
  public static Node insertAtHead(Node head, int val) {
    if (head == null) {
      Node newNode = new Node(val);
      return head;
    }
    Node newNode = new Node(val);
    newNode.next = head;
    head = newNode;
    return head;

  }

  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  public static void main(String args[]) {
    Node head = null;
    head = insertAtHead(head, 1);
    head = insertAtHead(head, 2);
    printList(head);
  }
}
