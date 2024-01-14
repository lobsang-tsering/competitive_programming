import java.util.Stack;
import java.util.Arrays;
class SortStack {
  
  static Stack<Integer> insert(Stack<Integer> s, Integer v) {
    if(s.isEmpty() || s.peek() <= v) {
      s.push(v);
      return s;
    }
    Integer temp = s.pop();
    insert(s,v);
    s.push(temp);
    return s;
  }

  static Stack<Integer> sort(Stack<Integer> s) {
    if(s.isEmpty()) {
      return s;
    }
    Integer v = s.pop();
    sort(s);
    return insert(s,v);
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.addAll(Arrays.asList(1,5,0,2));
    System.out.println(sort(s));
  }
}
