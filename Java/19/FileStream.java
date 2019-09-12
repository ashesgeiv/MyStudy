import java.io.*;

/**
 * FileStream 对于多媒体的复制
 */
public class FileStream {

    public static void main(String[] args) {

        String SourceFile = "1.jpg";
        String TargetFile = "2.jpg";
        copy(SourceFile, TargetFile);
    }

    static void copy(String SourceFile, String TargetFile) {

        BufferedInputStream bInputStream = null;
        BufferedOutputStream bOutputStream = null;

        try {
            bInputStream = new BufferedInputStream(new FileInputStream(SourceFile));// 源文件
            bOutputStream = new BufferedOutputStream(new FileOutputStream(TargetFile));// 目标文件

            BufferCopy(bInputStream, bOutputStream);

        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            CloseStream(bInputStream, bOutputStream);
        }
    }

    private static void BufferCopy(BufferedInputStream bInputStream, BufferedOutputStream bOutputStream)
            throws IOException {
        int by;
        while ((by = bInputStream.read()) != -1) {
            bOutputStream.write(by);
        }
    }

    private static void CloseStream(BufferedInputStream bInputStream, BufferedOutputStream bOutputStream) {
        try {
            if (bInputStream != null) {
                bInputStream.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            if (bOutputStream != null) {
                bOutputStream.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
