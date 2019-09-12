import java.io.*;


/**
 * BufferWriterDemo Ð´Èë»º³åÇødemo
 */
public class BufferWriterDemo {

    public static void main(String[] args) {
        FileWriter fWriter = null;
        BufferedWriter bWriter = null;
        try {
            fWriter = new FileWriter("demo.txt");
            bWriter = new BufferedWriter(fWriter);
            bWriter.write("nihao");
            bWriter.newLine();
            bWriter.write("next");
            bWriter.flush();
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            try {
                if (bWriter != null) {
                    bWriter.close();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }
}