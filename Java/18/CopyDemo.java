import java.io.*;

/**
 * CopyDemo ���Ʋ��� 1��ȷ��Դ�ļ���Ŀ���ļ� 2�����������������и��Ʋ��� 3���ر���Դ
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
            fReader = new FileReader("C:\\Users\\root\\OneDrive\\Java\\java�ؼ��֣�Ŀǰ��ѧ.txt");
            copy(fWriter, fReader);
        } catch (IOException e) {
            throw new RuntimeException("��ȡʧ��");
        } finally {
            closeFWriter(fWriter);
            closeFReadr(fReader);
        }
    }

    private static void copy(FileWriter fWriter, FileReader fReader) throws IOException {
        char[] buf = new char[1024];// ����һ��������
        int len = 0;
        while ((len = fReader.read(buf)) != -1) {
            fWriter.write(buf, 0, len);
            fWriter.flush();
        }
    }

    private static void closeFReadr(FileReader fReader) {
        if (fReader != null) {
            try {
                fReader.close();// �ر���Դ
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }

    private static void closeFWriter(FileWriter fWriter) {
        if (fWriter != null) {
            try {
                fWriter.close();// �ر���Դ
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}