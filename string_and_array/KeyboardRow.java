import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

class KeyboardRow {
    public String[] findWords(String[] words) {
        HashSet<Character> row1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        HashSet<Character> row2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        HashSet<Character> row3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));
        ArrayList<String> index = new ArrayList<>();
        
        for(int i = 0; i<words.length; i++){
            String str = words[i];
            char[] s = str.toLowerCase().toCharArray();
            if(row1.contains(s[0])){
                boolean able = true;
                for(char c: s){
                    if(!row1.contains(c)){
                        able = false;
                    }
                }
                if(able){
                    index.add(str);
                }
            }

            if(row2.contains(s[0])){
                boolean able = true;
                for(char c: s){
                    if(!row2.contains(c)){
                        able = false;
                    }
                }
                if(able){
                    index.add(str);
                }
            }

            if(row3.contains(s[0])){
                boolean able = true;
                for(char c: s){
                    if(!row3.contains(c)){
                        able = false;
                    }
                }
                if(able){
                    index.add(str);
                }
            }
        }

        return index.toArray(new String[0]);
    }
}
