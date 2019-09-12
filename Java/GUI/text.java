import java.awt.Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 * text
 */
public class text {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.setLocationRelativeTo(null);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("нд╪Ч");
        jMenuBar.add(fileMenu);

        JPanel jp = new JPanel();

        JButton jButton1 = new JButton();
        jp.add(jButton1);

        jf.setJMenuBar(jMenuBar);
        jf.setContentPane(jp);
        jf.setVisible(true);
    }
}
