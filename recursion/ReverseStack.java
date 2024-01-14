import java.util.Stack;
import java.util.Arrays;

class ReverseStack {
  static Stack<Integer> reverse(Stack<Integer> s) {
    if(s.isEmpty() || s.size() ==1) return s;

    Integer topElement = s.pop();
    return insert(reverse(s), topElement);
  }

  static Stack<Integer> insert(Stack<Integer> s, Integer v) {
    if(s.isEmpty()) {
      s.push(v);
      return s;
    }
    int temp = s.pop();
    Stack<Integer> reversed = insert(s, v);
    reversed.push(temp);
    return reversed;
  }

  public static void main(String[] args) {
    System.out.println("Reversing stack using recurssion");
    Stack<Integer> s = new Stack<>();
    s.addAll(Arrays.asList(1,2,3,4,5));
    System.out.println("before reverse");
    System.out.println(s);
    System.out.println("after reverse");
    System.out.println(reverse(s));
  }
}
