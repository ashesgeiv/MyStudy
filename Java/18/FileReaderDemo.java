import java.io.*;

/**
 * FileReaderDemo
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fReader = null;
        try {
            fReader = new FileReader("C:\\Users\\root\\OneDrive\\Java\\java�ؼ��֣�Ŀǰ��ѧ.txt");
            int num = 0;
            char[] buf = new char[1024];//�������������ж�ȡ
            while ((num = fReader.read(buf)) != -1) {
                System.out.print(new String(buf,0,num));
            }
        } catch (IOException e) {

        } finally {
            try {
                if (fReader != null) {
                    fReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }

}