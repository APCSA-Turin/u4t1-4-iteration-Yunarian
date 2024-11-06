
public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }
  
    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!
        DO THIS WITH A FOR LOOP
      */  
    public int countCharacters(String character, String searchString) {
      character = character.toLowerCase();
      searchString = searchString.toLowerCase();
      int count = 0;
      for (int i = 0; i < searchString.length(); i++) {
          if (searchString.substring(i, i + 1).equals(character)) {
            count++;
          }
      }
      return count;
    }
    
    /* Returns the original string reversed 
    */  
    public String reverseString(String origString) {
      String reversed = "";
      for (int i = origString.length(); i > 0; i--) {
        reversed += origString.substring(i - 1, i);
      }
      return reversed;
    }
  

  public String removeA(String string) {
    String withoutA = "";
    for (int i = 0; i < string.length(); i++) {
      String nextLetter = string.substring(i, i + 1);

      if (!nextLetter.equals("a")) {
        withoutA += nextLetter;
      }
    }
    return withoutA;
  }

  /* Returns a String with all instances of "searchChar" in "origString" replaced with
     "replaceChar"; matches should be case sensitive (i.e. no need to worry about
      lowercase vs. uppercase)

    PRECONDITION: searchChar and replaceChar are single characters and are not equal
    */  
    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
      String replacedStr = "";
      for (int i = 0; i < origStr.length(); i++) {
        String nextLetter = origStr.substring(i, i + 1);

        if (!nextLetter.equals(searchChar)) {
          replacedStr += nextLetter;

        } else {
          replacedStr += replaceChar;
        }
      }
    return replacedStr;
    }
   
    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
      String replacedStr = "";
      int i = 0;
      while (i < origStr.length()) {
        String nextLetter = origStr.substring(i, i + 1);

        if (!nextLetter.equals(searchChar)) {
          replacedStr += nextLetter;

        } else {
          replacedStr += replaceChar;
        }
        i++;
      }
    return replacedStr;
    }

      /* Returns the number of times "searchString" appears in "origString";
     matches should be case sensitive (i.e. no need to worry about lower vs. uppercase)
    */  
  public int countString(String searchString, String origString) {
    int count = 0;
    for (int i = 0; i <= origString.length() - searchString.length(); i++) {
          String nextString = origString.substring(i, i + searchString.length());
  
          if (nextString.equals(searchString)) {
            count++;
  
          } 
      }
      return count;
   }
 
       /* Returns a String with all instances of "searchString" removed from "origString";
       matches should be case sensitive (i.e. no need to worry about lowercase vs. uppercase)
    */  

  public String removeString(String searchString, String origString) {
    int posSearchStr = origString.indexOf(searchString); 
    while (posSearchStr != -1) {
      origString = origString.substring(0, posSearchStr) + origString.substring(posSearchStr + searchString.length());
      posSearchStr = origString.indexOf(searchString);
    }
    return origString;
   }

 /* Prints all integers from fromNum through toNum, separated by
     a commas and a space, on a single line;
     there should NOT be a comma after the final number.
    */  
    public void commaSeparated(int fromNum, int toNum) {
      int i = fromNum;
      while (i != toNum) {
        System.out.print(i + ", ");
        if (i > toNum) {
          i--;
        } else if (i < toNum) {
          i++;
        }
      } 
      System.out.println(i);

    }

    public boolean isPalindrome(String myString) {
      myString = removeString(" ", myString);
      String firstHalf = myString.substring(0, myString.length() / 2);
      String secondHalf;
      if (myString.length() % 2 == 0) {
        secondHalf = reverseString(myString.substring(myString.length() / 2));
      } else {
        secondHalf = reverseString(myString.substring(myString.length() / 2 + 1));
      }
    
      if (firstHalf.equals(secondHalf)) {
        return true;
      }
      return false;
    }

    /* Prints the String toPrint num times on a single line separated by spaces,
    within an opening bracket and closing bracket; there should not be a space
    between the final toPrint and the closing bracket,
    e.g. [hello hello hello hello]
    
    If numtimes <= 0, print just empty brackets (no space): []
    After printing the closing bracket, move the cursor to the next line.
     
    Examples:
    - toPrint = "hello" and num = 4, print: [hello hello hello hello]
    - toPrint = "beetlejuice" and num = 3, print: [beetlejuice beetlejuice beetlejuice]
    - toPrint = "hi there" and num = 2, print: [hi there hi there]
    - toPrint = "boop!" and num = 1, print: [boop!]
    - toPrint = "dance party" and num = 0, print: []
    - toPrint = "anything" and num = -4, print: []
    */
  public void multiPrint(String toPrint, int num) {
    System.out.print("[");
    for (int i = 0; i < num; i++) {
      System.out.print(toPrint);

      if (i != num) {
        System.err.print(" ");
      }
    }
    System.out.println("]");
  }

  
  
}