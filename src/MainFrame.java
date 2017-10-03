import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){
        initComp();
    }

    private Container cp;
    private JPanel jp = new JPanel(new GridLayout(7,1));
    private JTextArea jtaL = new JTextArea();
    private JTextArea jtaR = new JTextArea();
    private JScrollPane jspL=new JScrollPane(jtaL);
    private JScrollPane jspR=new JScrollPane(jtaR);

    private JButton jbt1 = new JButton("範例文");
    private JButton jbt2 = new JButton("加密");
    private JLabel jlab = new JLabel("Key");
    private JTextField jtf = new JTextField("csie");
    private JButton jbt3 = new JButton("清除");
    private JButton jbt4 = new JButton("解密");
    private JButton jbt5 = new JButton("Exit");


private void initComp(){

        this.setBounds(400,200,500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jp,BorderLayout.CENTER);
        cp.add(jspL,BorderLayout.WEST);
        cp.add(jspR,BorderLayout.EAST);

        jp.add(jbt1);
        jp.add(jbt2);
        jp.add(jlab);
        jp.add(jtf);
        jp.add(jbt3);
        jp.add(jbt4);
        jp.add(jbt5);

        jtaL.setPreferredSize(new Dimension(200,400));
        jtaR.setPreferredSize(new Dimension(200,400));

        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaL.setText("Nice to meet you.");
            }
        });
        jbt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //XOR加密
        }
        });
        jbt3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jtaL.setText("");
            jtaR.setText("");
        }
        });
        jbt4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //解密
        }
        });
        jbt5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
        });
    }

}
