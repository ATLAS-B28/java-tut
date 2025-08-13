package basicprograms;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        //gives 1 triplet only
        /*for(int i = 0; i <= 100; i++) {
            int a = (int)Math.pow(i,2);
            int b = (int) Math.pow(i+1,2);
            int c = (int) Math.pow(i+2,2);
            if(a+b == c) {
                System.out.println("Numbers: " + i + ", " + (i+1) + ", " + (i+2) + " are pythagorean triplets");
            }

        }*/
        //go from 1 to 100 and another for loop +1 to 100 then square and add them also find square root for 3rd one
        //and conditionally check if 3rd is in 100 and its square == squared addition of the 1st 2 numbers then print it
        for(int i = 1; i <= 100; i++) {
            for(int j = i+1; j <= 100; j++) {
                int squareAdd = i*i + j*j;
                int k = (int) Math.sqrt(squareAdd);
                if(k <= 100 && k*k == squareAdd) {
                    System.out.println("Numbers: " + i + ", " + (j) + ", " + (k) + " are pythagorean triplets");
                }
            }
        }
    }
}
