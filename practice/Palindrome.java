package practice;

public class Palindrome {
    public static boolean isPalindrome(String word) {
    	if (word.length() <= 1) return true;
    	word = word.toLowerCase();
    	
    	while (word.length() > 1)
    	{
    		if (word.charAt(0) == word.charAt(word.length()-1))
    		{
    			word = word.substring(1, word.length()-1);
    		}
    		else return false;
    	}
    	
    	return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
