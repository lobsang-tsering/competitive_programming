class Solution {
  public int minimumWindowSubstring(String s, String k) {
  }
}

class MinimumWindowSubstring {
  public static void main(String args) {
    System.out.printl("Minumum Window Sub String");
    Solution sol = new Solution();
    String s = "ADOBECODEBANC";
    String t = "BANC";
    int ans = sol.minimumWindowSubstring(s, t);
    System.out.println(ans);
  }
}
