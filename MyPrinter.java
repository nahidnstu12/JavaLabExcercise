/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nahid Aslam 12
 */
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
public class MyPrinter extends JFrame{
    private JButton ok,cancel,help,setup;
    private JComboBox jc;
    private JLabel x,y,z;
    private JCheckBox x1,x2,x3,x4;
     private JRadioButton y1,y2,y3;
    private JPanel checkPanel,buttonPanel,fieldpanel,fieldpanel1,fieldpanel2,radiopanel;
    private ButtonGroup gp;
    private ButtonGroup gp1;
    public String []name = {"High","Medium","Low"};
    MyPrinter()
    {
        super("Printer");
        x = new JLabel("Printer:My Printer ");
        y = new JLabel("Print Quality");
        
        x1 = new JCheckBox("Image");
        x2 = new JCheckBox("Text");
        x3 = new JCheckBox("Code");
        x4 = new JCheckBox("Print to File");
        checkPanel = new JPanel();
        checkPanel.setLayout(new GridLayout(4,1));
        checkPanel.add(x);
        checkPanel.add(x1);
        checkPanel.add(x2);
        checkPanel.add(x3);
        gp = new ButtonGroup();
        gp.add(x1);
        gp.add(x2);
        gp.add(x3);
        //gp.add(x4);
        
       
        z = new JLabel("");
       
        y1 = new JRadioButton("Selection");
        y2 = new JRadioButton("All");
        y3 = new JRadioButton("Applet");
       radiopanel =new JPanel();
       radiopanel.setLayout(new GridLayout(4,4));
       radiopanel.add(z);
       radiopanel.add(y1);
       radiopanel.add(y2);
       radiopanel.add(y3);
       gp1 = new ButtonGroup();
        gp1.add(y1);
        gp1.add(y2);
        gp1.add(y3);
        
       ok = new JButton("OK");
        cancel = new JButton("Cancel");
        setup = new JButton("SetUp...");
         help = new JButton("Help");
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,40,10,10));
        buttonPanel.add(ok);
        buttonPanel.add(cancel);
        buttonPanel.add(setup);
        buttonPanel.add(help);
        
        jc = new JComboBox(name);
        jc.setMaximumRowCount(3);
        fieldpanel = new JPanel();
        fieldpanel.setLayout(new FlowLayout());
        fieldpanel.add(y);
        fieldpanel.add(jc);
        fieldpanel.add(x4);
        
        
        //add(x);add(y);
       Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));
        container.add(checkPanel);
        container.add(radiopanel);
        container.add(buttonPanel);
        container.add(fieldpanel);
        
        setResizable(false);
        setVisible(true);
        setSize(400,350);
        
    }
    public static void main(String[] args) {
        MyPrinter app = new MyPrinter();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
