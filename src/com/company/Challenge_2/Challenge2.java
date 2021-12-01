package com.company.Challenge_2;
import java.util.ArrayList;
public class Challenge2 {

    public Challenge2(){

    }

    public ArrayList<String> splitWords(String startText){
        ArrayList<String> words = new ArrayList<>();
        String currentWord ="";
        for(int n = 0; n < startText.length(); n++){

            if(startText.charAt(n) == (' ')){
                words.add(currentWord);
                currentWord = "";
            } else {
                currentWord = currentWord + startText.charAt(n);
            }
        }
        words.add(currentWord);
        return words;
    }

    public String[] sortWords(ArrayList<String> unsortedWords){
        String[] sortedWords = new String[unsortedWords.size()];
        int startSize = unsortedWords.size();
        for (int n = 0; n < startSize; n++){
            int shortest = 1000;
            int index = 0;

            for(int m = 0; m < unsortedWords.size(); m++){
                if(unsortedWords.get(m).length() < shortest){
                    shortest = unsortedWords.get(m).length();
                    index = m;
                }
            }

            sortedWords[n] = unsortedWords.get(index);
            unsortedWords.remove(index);
        }
        return sortedWords;
    }


}
