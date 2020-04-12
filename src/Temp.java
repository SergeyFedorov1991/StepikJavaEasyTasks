import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Temp {
    public static void main(String[] args) throws IOException {
        Writer writer = new OutputStreamWriter(System.out);
        writer.flush();
    }



}
