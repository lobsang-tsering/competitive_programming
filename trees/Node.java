public class Node {
  Node left, right;
  int value;

  public Node(int v) {
    this.value = v;
  }

  public void insert(int x) {
     if(value >= x) {
         if(left == null) {
		left = new Node(x);
         } else {
		left.insert(x);
     	}
    } else {
       if(right==null) {
          right = new Node(x);
       } else {
          right.insert(x);
       }
   }
  }

 public boolean contains(int x) {
       if(value == x) return true;
        
       if(value > x) {
          if(left != null) {
              left.contains(x);
          } else 
	      return false;
       } else {
          if(right != null) {
             right.contains(x);
          } else 
	    return false;
       }
 }

 public void printInOrder() {

  //print left
   if(left != null) {
      left.printInOrder();
   }
  // print root
   System.out.println(value);

  // print right

  if(right != null) {
     right.printInorder();
 }
}
