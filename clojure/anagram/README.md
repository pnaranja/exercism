# Anagram

Write a program that, given a word and a list of possible anagrams, selects the correct sublist.

Given `"listen"` and a list of candidates like `"enlists" "google"
"inlets" "banana"` the program should return a list containing
`"inlets"`.


## Source

Inspired by the Extreme Startup game [view source](https://github.com/rchatley/extreme_startup)

## Algorithm?
Given a word and a list of other words:
1. Create a function (anagram?) that takes two words and determines if they're anagrams
    a. Turn both words lowercase (needs to be case insensitive)
    b. Make sure words are not equal
    c. Split each word into a list of sorted letters
    d. Compare the lists
2. Map a partial function of the anagram? that uses the initial word as the first argument and iterates over the possible anagrams 

