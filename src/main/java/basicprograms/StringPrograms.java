package basicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPrograms {
    /*
    *
#write a program to accept a 2 diff. characters and display the sum and diff. of their ASCII values.
#sample o/p - The sum of ASCII values = 165 and diff. of ASCII values = 35
    * */
    public static List<Integer> sumDiffASCII(char ch1, char ch2) {
        int sum = ch1 + ch2;
        int diff = Math.abs(ch1 - ch2);
        List<Integer> list = new ArrayList<>();
        list.add(sum);
        list.add(diff);
        return list;
    }

    /*
    * #Write a program to accept a alphabet in upper case or in lowr case. Display the next alphabet
#accordingly i.e. 'a' follows 'b' and 'z' follows 'a'
    * */
    public static void nextAlpha(char a) {
        if(a == 'z') {
            System.out.println('a');
        } else if (a == 'Z') {
            System.out.println('A');
        } else {
            System.out.println((char) (a+1));
        }
    }
    /*
    *#Write a program in java accept a string/word and display the new string after removing all the vowels present in it
#Sample i/p - COMPUTER APPLICATIONS
#Sample o/p - CMTR PPLCTNS
    * */
    public static String removeVowels(String str) {
        //use toCharArray, and then check whether it is in the vowels or not
        //if not then add the character to the result string
        StringBuilder res = new StringBuilder();
        char[] ch = str.toCharArray();
        char[] vowels = new char[]{'a','e','i','o','u','A','E','I','O','U'};
        for(int i = 0; i < ch.length; i++) {
            if(vowels[i] != ch[i]) {
                res.append(ch[i]);
            }
        }
        return res.toString();
    }
    /*
    * #Write a program to accept a character if it is a letter then display the case i.e. lower to upper
#otherwise check whether it is digit or special character
#Sample i/p - p
#Sample o/p - 'p is a letter p is a lower case'
    * */
    public static void caseCheck(char ch) {
        if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a letter " + ch + " is a lower case");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a letter " + ch + " is a upper case");
        } else if(ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a special character");
        }
    }
    /*
    * #Write a program to input a word/string count all the alphabets excluding vowels present in the word/string
#Sample i/p - Happy New Year
#Sample o/p - no. of alphabets excluding vowels = 8
    * */
    public static int countAlphaNotVowels(String str) {
        char[] ch = str.toCharArray();
        char[] vowels = new char[]{'a','e','i','o','u','A','E','I','O','U'};
        int count = 0;
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != vowels[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = sumDiffASCII('A', 'B');
        System.out.println("The sum of ASCII values = " + list.get(0) + " and diff. of ASCII values = " + list.get(1));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        nextAlpha(ch);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        System.out.println(removeVowels(input));
        System.out.println("Enter a character: ");
        char ch2 = sc.next().charAt(0);
        caseCheck(ch2);
        System.out.println("Enter a String: ");
        String input2 = sc.nextLine();
        System.out.println(countAlphaNotVowels(input2));
    }

}
