import javax.swing.*;
import java.awt.*;

public class Main1 {

    public static void main(String[] args) throws AWTException {
        JFrame jf = new JFrame("���Դ���");
        jf.setSize(200, 200);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // ����������ѡ��ť
        JRadioButton radioBtn01 = new JRadioButton("��");
        JRadioButton radioBtn02 = new JRadioButton("Ů");

        // ������ť�飬��������ѡ��ť��ӵ�����
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(radioBtn01);
        btnGroup.add(radioBtn02);

        // ���õ�һ����ѡ��ťѡ��
        

        panel.add(radioBtn01);
        panel.add(radioBtn02);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }

}