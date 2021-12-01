package com.company.Challenge_2;
import java.util.ArrayList;
public class Challenge2 {

    public Challenge2(){

    }

    /**
     * Method to split a string of words into an arraylist containing those words
     * @param startText A String to divide into words
     * @return ArrayList<String> The list of individual words
     */
    public ArrayList<String> splitWords(String startText){
        ArrayList<String> words = new ArrayList<>(); //Initialise ArrayList
        String currentWord =""; //Empty string to add the characters of the word to
        for(int n = 0; n < startText.length(); n++){ //Consider each letter

            if(startText.charAt(n) == (' ')){ // Spaces denote the end of a word
                words.add(currentWord); //Add the word we just found
                currentWord = "";//Clear the word to start the next word as empty
            } else {
                currentWord = currentWord + startText.charAt(n); // If not a space, then add whatever letter is here to the word
            }
        }
        words.add(currentWord);//Add our word to the list
        return words;
    }

    /**
     * Method to sort words from an ArrayList into ascending order of size
     * @param unsortedWords An ArrayList of words to sort
     * @return String[] An Array of words in ascending size order
     */
    public String[] sortWords(ArrayList<String> unsortedWords){
        String[] sortedWords = new String[unsortedWords.size()];//We know how many words there will be
        int startSize = unsortedWords.size();
        for (int n = 0; n < startSize; n++){// For however many words we have
            int shortest = 1000;// we will compare sizes to this large number; all should be smaller than this
            int index = 0; //index of the current shortest word

            for(int m = 0; m < unsortedWords.size(); m++){//loop to compare word lengths
                if(unsortedWords.get(m).length() < shortest){//If the word found at m is shorter
                    shortest = unsortedWords.get(m).length();// The length of this word is the new shortest
                    index = m;//Remember where to find it
                }
            }
            
            sortedWords[n] = unsortedWords.get(index); //When we have the shortest, add it to the sorted list
            unsortedWords.remove(index);//Remove it so it won't be used again
        }
        return sortedWords;


    }


}
