package exceptions;

public class Errors{
    public static int divide(int a,int b){
        return a / b;
    }
    public static void main(String[] args){
        System.out.println("Hello");
        try{
            int result = divide(10,0);
            System.out.println("Result: "+result);
        }catch(ArithmeticException e){
            System.out.println("Error: division by 0");
        }finally{
            //keep executing
            System.out.println("Finally");
        }
        System.out.println("End");
    }
}
