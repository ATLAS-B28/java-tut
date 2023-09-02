package exceptions;

public class Nested {
    public static void main(String[] args){
        try{
            //outer block
            int[] numbers = {1,2,3,4,5};
            System.out.println(numbers[5]);
            try{
                //inner try
                String text = null;
                System.out.println(text.length());
            }catch (NullPointerException e){
                System.out.println("Inner Block Error: "+e+"\n");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Outer Block Error: "+e+"\n");
        }
    }
}
