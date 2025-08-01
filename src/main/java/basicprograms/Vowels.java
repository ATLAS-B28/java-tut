package basicprograms;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String input = sc.nextLine().toLowerCase();
        char input2 = sc.next().toLowerCase().charAt(0);
        if(input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")) {
            System.out.println(input + " is vowel");
        } else {
            System.out.println(input + " is consonant");
        }
        if(input2 == 'a' || input2 == 'e' || input2 == 'i' || input2 == 'o' || input2 == 'u') {
            System.out.println( input2 + " is vowel using char");
        } else {
            System.out.println(input2 + " is consonant using char");
        }
    }
}
