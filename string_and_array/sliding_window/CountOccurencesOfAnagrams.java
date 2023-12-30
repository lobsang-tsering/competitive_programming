import java.util.HashMap;
import java.util.Map;

class CountOccurencesOfAnagrams {
  int countOccurencesOfAnagrams(String s, String p) {
    int p1 = 0;
    int p2 = 0;
    int count = 0;
    
    
    while(p2 < s.length) {
        if(p2 < p.length) {
          p2++;
        } else if(p2-p1+1 == p.length){
		if(isAnagram(s.substring(p1, p2+1), p)) count ++;
                p1++;
                p2++; 
	}
    }
    return count;
  }

  public static void main(String[] args) {
   System.out.println("Count Occurence Of Anagrams");
  }
}
