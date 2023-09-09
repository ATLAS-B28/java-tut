package Buffer;
import java.nio.ByteBuffer;
public class Example {
    public static void main(String[] args){
        //write
        ByteBuffer buf = ByteBuffer.allocate(10);
        byte[] bytes = {64,63,62};
        //write
        buf.put((byte) 67);
        buf.put((byte) 66);
        buf.put((byte) 65);
        //flip to read
        buf.flip();
        //reading from buffer
        while(buf.hasRemaining()){
            System.out.println(buf.get());
        }
        for(byte b : bytes){
            System.out.println(b);
        }
    }
}
