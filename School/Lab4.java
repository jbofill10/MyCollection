package lab;

import java.util.Scanner;

public class Lab4 {
    public static void test(){
        Scanner input = new Scanner(System.in);
        String stdIn = "";
        //Runs until empty lined is typed in
        while(true){
            System.out.print("Enter a word to check if it is a palindrome: ");
            stdIn = input.nextLine();
            
            if(stdIn.equals("")){
                break;
            }
            //Instead of sending a 1 character long string to isPalindrome, 
            //its determined its a palindrome
            if(stdIn.length()==1){
                System.out.println("true");
                break;
            }
            //Sends string to isPalindrome
            else{System.out.println(isPalindrome(stdIn));}
        }
    }
    /**
     * Recursive function that checks if the string is a palindrome 
     * @param s the String being passed through to check if its a palindrome 
     * @return true or false depending whether it is a palindrome or not 
     */
    public static boolean isPalindrome(String s){
        //Base case, if the string length is even, length will be 0. If odd, will be 1.
        //So I put 2 to ensure both conditions are found.
        if(s.length()<2){
            return true;
        }
        //Checks the first letter and back letter. If they match, they are removed from string
        //Progressively gets lower until it hits the base case.
            if(s.charAt(0) == s.charAt(s.length()-1)){
            s = s.substring(1, s.length()-1);
            return isPalindrome(s);

        }
        //If letters don't match above, it returns false. 
        else{ return false; }
       
	}
}