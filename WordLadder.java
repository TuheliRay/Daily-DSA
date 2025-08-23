import java.util.*;
class Pair{
    String first;
    int second;
    Pair(String f , int s){
        this.first=f;
        this.second=s;
    }
}
class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>(wordList);
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord , 1));
        set.remove(beginWord);
        while(!q.isEmpty()){
            String word=q.peek().first;
            int steps=q.peek().second;
            q.remove();
            char[] wordChars = word.toCharArray();
            if(word.equals(endWord))
            return steps;
            for(int i=0;i<word.length();i++){
                char original = wordChars[i];
                for(char ch='a';ch<='z';ch++){
                    wordChars[i]=ch;
                    String newWord=new String(wordChars);
                    if(set.contains(newWord)){
                        q.add(new Pair(newWord , steps+1));
                        set.remove(newWord);
                    }
                }
                wordChars[i]=original;
            }
        }
        return 0;
    }
}