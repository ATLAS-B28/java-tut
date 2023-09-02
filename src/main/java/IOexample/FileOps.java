package IOexample;
import java.io.*;
import java.lang.Throwable;
public class FileOps {
    public static void main(String[] args){
        //create file
        File file = new File("example.txt");
        try{
            boolean created = file.createNewFile();
            if(created){
                System.out.println("File created: "+ file.getAbsolutePath());
            }
            else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //write file
        try(FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ){
            bufferedWriter.write("Hello");
            bufferedWriter.newLine();
            bufferedWriter.write("World and also a new line");
            System.out.println("File written");
        }catch(IOException e){
            e.printStackTrace();
        }
        //read
        try(
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
        ){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        //delete
        boolean deleted = file.delete();
        if(deleted){
            System.out.println("File deleted");
        }else{
            System.out.println("File not deleted");
        }
    }
}
