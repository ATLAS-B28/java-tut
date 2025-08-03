package basicprograms;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        /*for(count = 100; count >= 50; count--) {
            if(count % 2 == 0) {
                System.out.println(count + "\n");

            }

        }
        int res = 0;
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0) res += i;
        }
        System.out.println(res);*/
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) System.out.println(num + " x " + i + " = " + (num * i));*/
        /*for(int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }*/
        Scanner sc = new Scanner(System.in);
        int res = 0;
        String num = sc.nextLine();
        System.out.println(num.toCharArray());

        for(int i = 0; i < num.length(); i++) {
            int charDigit = num.charAt(i) - '0';
            System.out.println(charDigit);
            res += charDigit ;

        }

        System.out.println(res);
    }
}
