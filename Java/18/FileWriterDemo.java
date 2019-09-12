import java.io.*;

/**
 * FileWriterDemo
 */
class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter("demo.txt",true);
            fw.write("\r\nnihao");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}