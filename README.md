#Core Java Project (Week 1)

* [Challenge 1](#challenge-1)
* [Challenge 2](#challenge-2)
#Challenge 1

Find the sum of all the multiples of 3 or 5 below 1000.

I have done this by checking the remainder of all numbers from 1-999 and comparing these to 0. If the remainder is 0 then the number is added to a running total.

#Challenge 2

Sort a String such as "Words of different lengths" into an Array of ascending size order:
[of, Words, lengths, different].

I have done this by first splitting the String into single words in an ArrayList using the splitWords method:
"Words of different lengths" becomes : ["Words", "of", "different", "lengths"].
We then sort this ArrayList into an Array in ascending size order using the sortWords method:
["Words", "of", "different", "lengths"] becomes ["of", "words", "lengths", "different"].
