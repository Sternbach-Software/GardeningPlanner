import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RandomTests4 {
    public static void main(String[] args) {
        try (SeekableByteChannel ch = Files.newByteChannel(Paths.get("test.txt"))) {
            ByteBuffer bb = ByteBuffer.allocateDirect(1000);
            for(;;) {
                StringBuilder line = new StringBuilder();
                int n = ch.read(bb);
//                if(line.charAt(line.indexOf(("Score: "))||)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
