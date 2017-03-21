**ScrabbleChecker**

This is a quick project to see what a given word's scrabble value is.

We'll go through getting you mostly set up, and then you can all go and extend it.

**Goal 0**

Before we start hacking, we need to set up some semblance of testing.  Y'all know that.

**Goal 1**

Given a String, verify that the word is a real word and, if it is, print it's scrabble value.
If it's a bogus word, say so.

**Goal 2**

Now let's check and make sure that the word can actually be built from all the tile in the board.
This means checking that the word is a real word and that it can be composed by the tiles (excluding blank tiles) that come with a Scrabble board.
If the word is bogus, say so.
If the word can't be built with the given letters, say so.
Otherwise, print out the value of the word.

**Goal 3**

Account for blank tiles now.  Just because a word has 2 Q's in it doesn't mean it's impossible to make that word.
Again, throw out bogus words, words that can't be built, and print the values of regular words.  
But now, if a word can be built with blank tiles, say that.  You don't need to do the math, just say that it can be built, but you need blanks.

**Goal 4**

Get wild and figure out the optimal score, including blank tiles.