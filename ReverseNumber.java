//7) Write a program to reverse a given number and print


package Assignment1;

public class ReverseNumber {


  public static void main(String[] args) {

      int num = 1234, reversed = 0;

      while(num != 0) {
          int digit = num % 10;
          reversed = reversed * 10 + digit;
          num /= 10;
      }

      System.out.println("Reversed Number: " + reversed);
  }
}