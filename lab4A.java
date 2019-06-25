//Nikhil Malani
import java.util.*;


public class lab4A {    
    // Function to check the Vowel also the base case 
    static int checkVowel(char ch) 
    { 
        ch = Character.toUpperCase(ch); 
       if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')  
           return 1; 
       else return 0; 
    } 
    // check through the string and take each element as an character which will then return the count 
    static int countVowels(String str, int n) 
    { 
        if (n == 1) {
        return checkVowel(str.charAt(n - 1)); 
        }
        else{
        return countVowels(str, n-1) + checkVowel(str.charAt(n - 1)); 
        }
    } 
       
    // create Main Function 
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please enter a text:\0");
        String str = input.nextLine(); 
        
       
        // Total numbers of Vowel 
        System.out.println("Vowel Count: \0" + countVowels(str,str.length())); 
    } 
} 