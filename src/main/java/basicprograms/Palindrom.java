package basicprograms;
import java.util.Scanner;
public class Palindrom{

   public static void main(String[] args){
       Scanner sc  =new Scanner(System.in);
       System.out.println("Enter a word: ");
       String word = sc.nextLine();
       String reverse = "";
       for(int i = word.length()-1; i>=0; i--){
           reverse += word.charAt(i);
       }
       if(word.equals(reverse)){
           System.out.println(word+" is a palindrom");
       }
       else{
           System.out.println(word+" is not a palindrom");
       }
   }
}