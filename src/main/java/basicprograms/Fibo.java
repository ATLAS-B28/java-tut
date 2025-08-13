package basicprograms;
/*
public class Fibo {
    public static void main(String[] args){
        int n1=0, n2=1, n3, i, count=10;
        System.out.println(n1+" "+n2);//printing
        for(i=2;i<count;i++){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}*/
//recursion
public class Fibo{
    static int n1=0, n2=1,n3=0;
    static void printFibo(int count){
        if(count>0){
            n3 = n1 + n2;
            n1=n2;
            n2=n3;
            System.out.println(" "+n3);
            printFibo(count-1);
        }
    }
    public static void main(String[] args){
        int count = 20;
        System.out.println(n1+" "+n2);
        printFibo(count-2);
    }
}