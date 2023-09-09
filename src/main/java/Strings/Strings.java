package Strings;

public class Strings {
    public static void main(String[] args) {
        String str1  ="Hello";
        str1 = str1 + " World";
        System.out.println(str1);
        StringBuffer strBuf = new StringBuffer("Hello");
        strBuf.append(" World");
        System.out.println(strBuf);
        StringBuilder strBuild = new StringBuilder("Hello");
        strBuild.append(" World");
        System.out.println(strBuild);
    }
}
