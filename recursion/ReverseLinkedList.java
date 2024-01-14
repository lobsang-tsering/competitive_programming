public class ReverseLinkedList {
  static class Node {
    private int val;
    private Node next;

    public Node(int val) {
      this.val = val;
    }

    public void setNext(Node node) {
      this.next = node;
    }

    public Node getNext() {
      return next;
    }
  }

  public static void main(String[] arguments) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    n1.setNext(n2);
    n2.setNext(n3);
    n3.setNext(n4); 
    n4.setNext(n5);

    System.out.println("Before reverse");
    printLinkedList(n1);
    System.out.println("\nAfter reverse \n");
    printLinkedList(reverseList(n1));
  }
  
  public static Node reverseList(Node node) {
    if(node == null || node.next == null) {
      return node;
    }

    Node newHead = reverseList(node.next);
    node.next.next = node;
    node.next = null;
    return newHead;
  }

  public static void printLinkedList(Node node) {
    Node temp = node;
    while(temp != null) {
      System.out.print(temp.val + " --> ");
      temp = temp.getNext();
    }
  }
}


