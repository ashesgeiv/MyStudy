import java.io.*;

/**
 * StreamWithString
 */
public class StreamWithString {

    public static void main(String[] args) {
        BufferedReader bReader = null;
        BufferedWriter bWriter = null;
        String line = null;
        try {
            bReader = new BufferedReader(new InputStreamReader(new FileInputStream("Copydemo.txt")));
            bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            while ((line = bReader.readLine()) != null) {
                if ("over".equals(line)) {
                    break;
                }
                bWriter.write(line);
                bWriter.newLine();
                bWriter.flush();

            }
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
            try {
                if (bReader != null) {
                    bReader.close();
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}