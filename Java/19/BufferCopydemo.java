import java.io.*;

/**
 * BufferCopydemo 用于文本的复制
 */
public class BufferCopydemo {

    public static void main(String[] args) {
        BufferedReader bReader = null;
        BufferedWriter bWriter = null;
        String SourceFile = "BufferWriterDemo.java";
        String TargetFile = "demo.txt";
        copy(bReader, bWriter, SourceFile, TargetFile);
    }

    private static void copy(BufferedReader bReader, BufferedWriter bWriter, String SourceFile, String TargetFile) {
        try {
            bReader = new BufferedReader(new FileReader(SourceFile));
            bWriter = new BufferedWriter(new FileWriter(TargetFile));

            BufferCopy(bReader, bWriter);// 用于buffer的copy方法
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            close_bReader(bReader);
            close_bwriter(bWriter);
        }
    }

    private static void BufferCopy(BufferedReader bReader, BufferedWriter bWriter) throws IOException {
        String line;
        LineNumberReader lReader = new LineNumberReader(bReader);
        while ((line = lReader.readLine()) != null) {
            bWriter.write(lReader.getLineNumber() + "\t" + line);
            bWriter.flush();
            bWriter.newLine();
        }
    }

    private static void close_bwriter(BufferedWriter bWriter) {
        try {
            if (bWriter != null) {
                bWriter.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private static void close_bReader(BufferedReader bReader) {
        try {
            if (bReader != null) {
                bReader.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}