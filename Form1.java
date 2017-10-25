import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {

    private JTextField textField1;
    private JPanel panel1;
    private JCheckBox checkBox1;
    private JRadioButton radioButton1;
    private JTextArea textArea1;
    private JComboBox comboBox1;
    private JTextPane textPane1;
    private JButton button1;
    private JButton button1Button;
    private JButton button2Button;

    public Form1() {
        button1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f = Form2.getMainFrame(); //get reference to the main frame for the application
                f.setTitle("Form 1");
                JPanel[] allPanels = Form2.getAllPanels(); //get reference to all the forms in application
                f.setContentPane(allPanels[0]); //change frame to display form 1 at this point
                f.validate();
                f.pack();

            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }
}
