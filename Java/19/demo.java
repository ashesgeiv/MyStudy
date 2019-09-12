import java.io.*;

/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        BufferedReader bReader = null;
        BufferedWriter bWriter = null;
        

        try {
            bReader = new BufferedReader(new InputStreamReader(System.in));
            bWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            String line;
            while ((line = bReader.readLine()) != null) {
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