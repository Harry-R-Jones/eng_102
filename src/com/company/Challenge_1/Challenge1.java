package com.company.Challenge_1;

public class Challenge1 {

    public Challenge1(){

    }

    /**
     *
     * @param upperBound int The upper bound for numbers that we will consider
     * @return int the sum of all values below upper bound wholly divisible by 3 or 5
     */
    public int challenge1(int upperBound){
        int sum = 0; //initialise a counter for the running total

        for(int i = 0; i < upperBound; i++){ //loop to iterate through to the upper bound
            if((i % 3 == 0) || (i % 5 == 0)){ //check if the current number is divisible by 3 or by 5
                sum = sum +i; //increase running total if conditions are met
            }
        }

        return sum;
    }
}
