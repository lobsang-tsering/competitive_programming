import java.util.Stack;
import java.util.Arrays;

class DeleteMiddleElement {
  static Stack<Integer> deleteMiddle(Stack<Integer> s, int k) {
    if(s.isEmpty()) {
      return s;
    }
    return solve(s,k);
  }

  static Stack<Integer> solve(Stack<Integer> s, int k) {
    if(k == 1) {
      s.pop();
      return s;
    }

    Integer temp = s.pop();
    solve(s, --k);
    s.push(temp);
    return s;
  }

  public static void main(String[] args) {
    System.out.println("Deleting middle Element");
    Stack<Integer> stack = new Stack<>();
    stack.addAll(Arrays.asList(1,2,3,4,5));
    int k = stack.size()/2 + 1;
    System.out.println(deleteMiddle(stack,k));
  }
}
