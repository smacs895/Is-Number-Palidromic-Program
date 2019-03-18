// Program to determine if a number provided by command line is palindromic
// or not. 
public class isNumberpPalindromic{
 public static void main(String args[]){
   // Create Strings for error messages 
   // eg. - if a word is input instead of a number. 
   //     - if more than one command line argument is provided.
   //     - if the number is greater than 99999999.
   //     - if no command line argument is provided. 
   String errorMessage1 = "No command-line argument provided.";
   String errorMessage2 = "Incorrect number of command-line arguments provided.";
   String errorMessage3 = "Format of user input is invalid.";
   
   // Use String pattern to ensure the number input is equal to or under 999999999.
   String pattern = "[0-9]{1,9}", result;
   boolean isPalindrome;
   if(args.length == 0)
     result = errorMessage1;
   else if(args.length != 1)
     result = errorMessage2;
   else if(!(args[0].matches(pattern)))
     result = errorMessage3;
   else{
     isPalindrome = checkIfPalindrome(args[0]);
     if(isPalindrome)
       result = "The number provided is Palindromic!\n";
     else
       result = "The number provided is not Palindromic!\n";
   }
   // Output the result message. 
   System.out.println(result);
 }

 // Method to check if number is palindromic. 
 public static boolean checkIfPalindrome(String input){
    int num = Integer.parseInt(input);
    int copyOfNum = num, reverse = 0, remainder;
    while (num != 0){
      remainder = num % 10;
      reverse = reverse * 10 + remainder;
      num = num / 10;
    }
    
    // Output the number and the number in reverse. 
    System.out.println("Number provided:\t\t" + copyOfNum);
    System.out.println("Number provided in reverse:\t" + reverse);
    
    // Check if the numbers match and output true if palindromic or false if not. 
    if(copyOfNum == reverse)
      return true;
    else
      return false;
 }
}