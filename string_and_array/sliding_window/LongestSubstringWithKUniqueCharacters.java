import java.util.HashMap;

class LongestSubstringWithKUniqueCharacters {
  static int findLongestSubstring(String str, int k) {
    int i = 0;
    int j = 0;
    int max = Integer.MIN_VALUE;

    HashMap<Character, Integer> m = new HashMap<>();

    while(j < str.length()) {
      Character cl = str.charAt(j);
      if(m.containsKey(cl)){
        m.put(cl, m.get(cl)+ 1);        
      } else {
        m.put(cl, 1);
      }

      if(m.size() < k) {
         j++;
      } else if(m.size() == k){
         max = Math.max(max, j-i+1);
         j++;
      } else if(m.size() > k) {
          while(m.size() > k) {
             if(m.containsKey(str.charAt(i))) {
                int v = m.get(str.charAt(i)) - 1;
                if(v > 0)
                  m.put(str.charAt(i), v);
                else 
                  m.remove(str.charAt(i));
             }
             i++;
          }
          j++;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    String s = "aabacbebebe";
    System.out.println(findLongestSubstring(s,3));
  }
}
