package academy.learnprogramming.stackschallenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
      
    	 
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
    	// this method uses stack operations to check for palindrome.
    	//ignore punctuation and spaces

    	LinkedList<Character> stack = new LinkedList<Character>();
    	String lettersOnly = string.replaceAll("[^a-zA-Z]", "");
    //	System.out.println(lettersOnly);
   lettersOnly = lettersOnly.toLowerCase();
	//System.out.println(lettersOnly);
    	for (int i = 0; i < lettersOnly.length(); i++) {
            stack.push(lettersOnly.charAt(i));
        }
    	
    	String reverseInput = "";
    while (!stack.isEmpty()) {
            reverseInput += stack.pop();
        }
    if (lettersOnly.equals(reverseInput)) {
        System.out.println("Yo! that is a palindrome.");
        return true;
    }
    else {
        System.out.println("No! that isn't a palindrome.");
        return false;
    }
    }
}
