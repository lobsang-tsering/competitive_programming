import java.util.*;

class Flag {
   public static List<Integer> sortOnPivot(List<Integer> A, int pivot) {
      int e,s,l;
      e = s = 0;
      l = A.size();
      System.out.println("inside Flag calssi");
      while(e<l) {
          if(A.get(e) < pivot) {
             Collections.swap(A, e++, s++);
          } else if(A.get(e) == pivot) {
             e++;
          } else {
            Collections.swap(A, e, --l);
          }
      }
      return A; 
  }
  
}
