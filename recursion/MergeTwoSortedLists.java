public class MergeTwoSortedLists {
  static class Node {
    int val;
    Node next;

    public Node(int val) {
      this.val = val;
    }

    public void setNext(Node node) {
      this.next = node;
    }
  }


  public static void main(String[] args) {
    Node n1_1 = new Node(1);
    Node n1_2 = new Node(3);
    Node n1_3 = new Node(5);
    Node n1_4 = new Node(7);
    
    Node n2_1 = new Node(1);
    Node n2_2 = new Node(2);
    Node n2_3 = new Node(4);
    Node n2_4 = new Node(6);

    n1_1.setNext(n1_2);
    n1_2.setNext(n1_3);
    n1_3.setNext(n1_4);

    n2_1.setNext(n2_2);
    n2_2.setNext(n2_3);
    n2_3.setNext(n2_4);

    Node mergedNode = mergeNodes(n1_1, n2_2);

    while(mergedNode.next != null) {
      System.out.print(mergedNode.val + " -->");
      mergedNode = mergedNode.next;
    }
  }

  public static Node mergeNodes(Node A, Node B) {
    if(A == null) return B;
    if(B == null) return A;

    if(A.val <= B.val) {
      A.next = mergeNodes(A.next, B);
      return A;
    } else {
      B.next = mergeNodes(A, B.next);
      return B;
    }
  }
}
