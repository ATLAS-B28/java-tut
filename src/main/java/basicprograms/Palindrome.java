package basicprograms;
import java.util.Scanner;
public class Palindrome {

   public static void main(String[] args){
       Scanner sc  =new Scanner(System.in);
       System.out.println("Enter a word: ");
       String word = sc.nextLine();
       StringBuilder reverse = new StringBuilder();
       for(int i = word.length()-1; i>=0; i--){
           reverse.append(word.charAt(i));
       }
       if(word.contentEquals(reverse)){
           System.out.println(word+" is a palindrome");
       } else{
           System.out.println(word+" is not a palindrome");
       }
   }
}