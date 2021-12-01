package NameShuffler;

public class NameShuffler {

    /**
     * Method to swap two words in a string to be the other way round
     * @param names The full name as a String
     * @return flippedNames the two names in reverse word order
     */
    public String flipNames(String names){
        //Initialise a starting string to add the names to
        String flippedNames = null;

        //Loop through each letter to find the space, which separates the two names
        for(int i = 0; i < names.length(); i++){
            if(names.charAt(i) == ' '){
                //When found, add the names the other way round
                flippedNames = names.substring(i + 1) + ' ' + names.substring(0, i);
            }
        }
        return flippedNames;
    }
}
