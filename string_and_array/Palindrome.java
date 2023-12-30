class Palindrome {
  
  boolean isPelindrome(String phrase) {
    int[] lookUp = createLookUp(phrase);
    return checkMaxOdd(loopUp);
  }

  boolean checkMaxOdd(lookUp) {
     boolean foundOdd = false;
     for(int count: lookUp) {
           if(count % 2 == 1) {
              if(foundOdd) return false;
              foundOdd=true;
           }
     }
     return true;
  }

  int getCharNumber(Character c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    
    if(a <= c && c <=z){
       return c - a;
    else 
       return -1;
    }
  }

  int[] createLookUp(String phrase) {
    int[] table = new int[26];
    
    for(Char c: phrase.toCharArray()) {
      int x = getCharNumber(c);
      table[x]++;
    }

    return table;
  }

  public static void main(String[] s) {  
  }
}
