import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by T00036644 on 25/10/2017.
 */
public class MainForm {
    private JPanel mainFormPanel;
    private JButton pressMe1Button;
    private JButton pressMe2Button;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel outputLabel;

    private static JFrame myFrame;

    private static JPanel anotherFormPanel;

    public MainForm() {
        pressMe2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You pressed me");
                JFrame myFrame2 = new JFrame("Another Form");

                myFrame2.setContentPane(anotherFormPanel);
                myFrame2.validate();
                myFrame2.pack();
                myFrame2.setVisible(true);
            }
        });
    }

    public JPanel getMainPanel(){
        return mainFormPanel;
    }


    public static void main(String[] args) {
        //create a frame to hold your forms
        JFrame myFrame=new JFrame("Main JFrame");

        //create a Jpanel object to hold Jpanel Object created
        JPanel mfp = new MainForm().getMainPanel();

        myFrame.setContentPane(mfp);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);

        //Create second JPanel from another form
        anotherFormPanel = new Form1().getPanel1();

    }



}
