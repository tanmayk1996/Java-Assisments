//8)Write a Java program to find if the given number is palindrome or not
	


package Assignment1;



public class Palindrome {

	
	{

	     public static void main (String args[])
	    {

	        int num =313, reversedInteger = 0, remainder, originalInteger ;

	        originalInteger = num;

	        // reversed integer is stored in variable 
	        while( num != 0 )
	        {
	            remainder = num % 10;
	            reversedInteger = reversedInteger * 10 + remainder;
	            num  /= 10;
	        }

	        // palindrome if orignalInteger and reversedInteger are equal
	        if (originalInteger == reversedInteger)
	            System.out.println(originalInteger + " is a palindrome.");
	        else
	            System.out.println(originalInteger + " is not a palindrome.");
	    }
	}
}