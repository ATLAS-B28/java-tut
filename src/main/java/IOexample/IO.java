package IOexample;
import java.util.Scanner;
public class IO {
    public static void main(String[] args){
        //reading
        Scanner scan =  new Scanner(System.in);//initiate scanner
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        ///output
        System.out.println("Name: "+name+", Age: "+age+"\n");
        //close
        scan.close();
    }
}
