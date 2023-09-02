package serailizers;
import java.io.*;
class Person implements Serializable{
    private final String name;
    private final int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
     return name + " : " + age;
    }
}
public class Example {
    public static void main(String[] args){
        //create an object to serialize
        Person p = new Person("Abhijeet", 29);
        //serializing the object
        try{
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\abhij\\Desktop\\javaproject\\src\\main\\java\\serailizers\\person.html");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //deserialize
        try{
            FileInputStream fileIn = new FileInputStream("C:\\Users\\abhij\\Desktop\\javaproject\\src\\main\\java\\serailizers\\person.html");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
