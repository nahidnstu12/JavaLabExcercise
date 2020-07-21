/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahid Aslam 12
 */
import java.awt.*;
import javax.swing.*;
public class Allign2 extends JFrame {
    private JButton ok,cancel,help;
    private JTextField jt1,jt2;
    private JLabel X,Y;
    private JCheckBox show,snap;
    private JPanel checkPanel,buttonPanel,fieldpanel,fieldpanel1,fieldpanel2;
    public Allign2()
    {
        super("Align");
        snap = new JCheckBox("Snap to Grid");
        show = new JCheckBox("Show to Grid");
        checkPanel = new JPanel();
        checkPanel.setLayout(new GridLayout(2,1));
        checkPanel.add(snap);
        checkPanel.add(show);
        X = new JLabel("X: ");
        jt1=new JTextField("8",3);
        fieldpanel1 = new JPanel();
        fieldpanel1.setLayout(new FlowLayout());
        fieldpanel1.add(X);
        fieldpanel1.add(jt1);
         Y = new JLabel("Y: ");
         jt2=new JTextField("8",3);
        fieldpanel2 = new JPanel();
        fieldpanel2.setLayout(new FlowLayout());
        fieldpanel2.add(Y);
        fieldpanel2.add(jt2);
        fieldpanel = new JPanel();
        fieldpanel.setLayout(new BorderLayout());
        fieldpanel.add(fieldpanel1,BorderLayout.NORTH);
        fieldpanel.add(fieldpanel2,BorderLayout.SOUTH);
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        help = new JButton("Help");
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,1,10,5));
        buttonPanel.add(ok);
        buttonPanel.add(cancel);
        buttonPanel.add(help);
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        container.add(checkPanel);
        container.add(fieldpanel);
        container.add(buttonPanel);
        setVisible(true);
        setSize(300,150);
    }
    public static void main(String[] args) {
        Allign2 app = new Allign2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
