import java.util.HashSet;
import java.util.Set;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    int max = 0;
    int i = 0;
    int j = 0;
    Set<Character> set = new HashSet<>();

    while(j < s.length()) {
      if(!set.contains(s.charAt(j))){
        set.add(s.charAt(j));
        max = Math.max(max, j-i+1);
        j++;
      } else {
        set.remove(s.charAt(i));
        i++;
      }
    }
    return max;
  }
}

class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
       String s =" ";
       Solution solver = new Solution();
       int max = solver.lengthOfLongestSubstring(s);
       System.out.println(max);
    }
}
