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
       System.out.println("Enter a number: ");
       int reversedNum = 0;
       int rem;
       int num = sc.nextInt();
       int temp = num;
       while(temp != 0) {
           rem = temp % 10;
           reversedNum = reversedNum * 10 + rem;
           temp = temp / 10;
       }
       if(num == reversedNum) {
           System.out.println(num + " is a palindrome");
       } else {
           System.out.println(num + " is not a palindrome");
       }
   }
}