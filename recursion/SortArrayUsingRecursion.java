import java.util.ArrayList;
import java.util.Arrays;
class SortArrayUsingRecursion {
  
  static ArrayList<Integer> insert(ArrayList<Integer> a, Integer v) {
    if(a.isEmpty() || a.get(a.size() - 1) <= v) {
      a.add(v);
      return a;
    }
    int temp = a.remove(a.size() - 1);
    insert(a, v);
    a.add(temp);
    return a;
  }
  static ArrayList<Integer> sort(ArrayList<Integer> arr) {
    if(arr.size() == 1)
      return arr;
    int lastElement = arr.remove(arr.size() - 1);
    return insert(sort(arr), lastElement);
  }

  public static void main(String[] arg) {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,5,0,2));
    System.out.println(sort(arr));
  }
}
