import java.io.*;

/**
 * CopyDemo 复制步骤 1，确立源文件和目标文件 2，创建缓冲区并进行复制操作 3，关闭资源
 */
public class CopyDemo {

    public static void main(String[] args) {
        FileWriter fWriter = null;
        FileReader fReader = null;

        extracted(fWriter, fReader);
    }

    private static void extracted(FileWriter fWriter, FileReader fReader) {
        try {
            fWriter = new FileWriter("copydemo.txt");
            fReader = new FileReader("C:\\Users\\root\\OneDrive\\Java\\java关键字（目前已学.txt");
            copy(fWriter, fReader);
        } catch (IOException e) {
            throw new RuntimeException("读取失败");
        } finally {
            closeFWriter(fWriter);
            closeFReadr(fReader);
        }
    }

    private static void copy(FileWriter fWriter, FileReader fReader) throws IOException {
        char[] buf = new char[1024];// 创建一个缓冲区
        int len = 0;
        while ((len = fReader.read(buf)) != -1) {
            fWriter.write(buf, 0, len);
            fWriter.flush();
        }
    }

    private static void closeFReadr(FileReader fReader) {
        if (fReader != null) {
            try {
                fReader.close();// 关闭资源
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }

    private static void closeFWriter(FileWriter fWriter) {
        if (fWriter != null) {
            try {
                fWriter.close();// 关闭资源
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}