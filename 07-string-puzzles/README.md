# String Puzzles
#### Respond to the following:

1. *In your own words*, discuss what each String method does:
  * `.substring(a)`
    * Gets the characters after index a (for "Test", if a = 2, then its substring will be "st")

  * `.substring(a, b)`
    * Gets the characters from index a up until index b, excludes b ("Macintosh" and a = 2, b = 5, substring will be "cin)

  * `.indexOf(str)`
    * Finds the character in a string ("pie" and str = e will be 2)

  * `.equals(str)`
    * Checks if the string is equivalent to itself ("hello" and "hi" will not be equal, but "a" and "a" will)


2. *In your own words*, discuss what the following `for` loop accomplishes for `String s`:
```
for(int i = 0; i < s.length(); i++) {
      // DO STUFF
}
```
  * Loops for the length of the string, if the length is 5, it will loop 5 times. This can be used for work on the string used for the loop
