package HashMap;

import java.util.HashMap;

public class wordFrequencyCounter {
    public static void main(String[] args) {
        HashMap<String,Integer> wordcount = new HashMap<>();
        String text="the quick brown fox jumps over the lazy dog the fox";
        String[] word=text.split(" ");
        for(String words:word){
            if(wordcount.containsKey(words)){
                wordcount.put(words,wordcount.get(words)+1);
            }
            else{
                wordcount.put(words,1);
            }
        }
        System.out.println(wordcount);
    }
}
