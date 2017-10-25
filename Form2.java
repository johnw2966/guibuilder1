import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form2 {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JTextArea TextArea;
    private JButton button9;
    private JRadioButton radioButton1;
    private JTextField textField1;
    private JButton button10;
    private static JFrame frame; //make available to all other classes via Form2 class directly
    private static JPanel[] allPanels; //ditto

    public  static JPanel[] getAllPanels() {
        return allPanels;
    }

    public  static void setAllPanels(JPanel[] allPanels) {
        Form2.allPanels = allPanels;
    }



    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public static void main(String[] args) {
        frame = new JFrame("Form2");

        allPanels = new JPanel[5];
        allPanels[0] = new Form2().getPanel1();
        allPanels[1] = new Form1().getPanel1();
        //instantiate any other forms at this point and just add them to the array
        setAllPanels(allPanels);

        frame.setContentPane(allPanels[0]);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public Form2() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setTitle("Form 2");
                frame.setContentPane(allPanels[1]); //change to Form1 at this point
                frame.validate();
                frame.pack();

            }
        });

    }

    public JPanel getPanel1() {
        return panel1;
    }

    public static JFrame getMainFrame(){
        return frame;
    }



}
