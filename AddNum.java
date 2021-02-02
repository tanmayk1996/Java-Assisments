//5)Write a program to add all the values in a given number and print. Ex: 1234->10

package Assignment1;

public class AddNum {

	


 
      public static void main( String[] args ) 
      { 
          Scanner keyboard = new Scanner(System.in); 
          System.out.println( " \n" ); 
 

          System.out.println( "Number: " ); 
          int number = keyboard.nextInt(); 
          int sum = 0; 
 

          for (int run=1; run<=number; run=run+1) 
          { 
              System.out.print( run + " " ); 
              sum = sum + 1 ; 
          } 
 
         System.out.println( "The sum is . " ); 
     } 
 } 

