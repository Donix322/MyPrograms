 
 /*ITCC11 A
	*October 20, 2020
	*Midterm Exam
*/
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Converter {
    
	private	JFrame frame;
    private JPanel buttonPane, fieldsPanel, mainPanel;
    private JLabel currate, amconv, output, ot;
    private JTextField currateField, amconvField;
	private ActionListener outputActionListener;
	private SpringLayout spring;
	double num1=0, num2=0, result=0;

    Converter() {
        frame = new JFrame("Midterm Dollar to Peso Converter");
		frame.setSize(400,175);
        buttonPane = new JPanel();
        fieldsPanel = new JPanel();
        currate = new JLabel("Current Rate");
        amconv = new JLabel("Amount to Convert");
		output = new JLabel("Output");
        currateField = new JTextField("");
        amconvField = new JTextField("");
		outputActionListener = new resultActionListner();

        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.PAGE_AXIS));
        buttonPane.setLayout(new FlowLayout());
		
		spring = new SpringLayout();
		outputActionListener = new resultActionListner();

        fieldsPanel.add(currate);
        fieldsPanel.add(currateField);
        fieldsPanel.add(amconv);
        fieldsPanel.add(amconvField);
        frame.add(fieldsPanel, BorderLayout.PAGE_START);
        frame.add(buttonPane, BorderLayout.PAGE_END);
		
		spring.putConstraint(SpringLayout.WEST, ot, 50, SpringLayout.WEST, mainPanel);
		spring.putConstraint(SpringLayout.NORTH, ot, 100, SpringLayout.NORTH, mainPanel);
		spring.putConstraint(SpringLayout.WEST, ot, 50, SpringLayout.EAST, mainPanel);
		spring.putConstraint(SpringLayout.NORTH, ot, 100, SpringLayout.NORTH, mainPanel);
		frame.add(mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
	
	class resultActionListner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				String rate = currate.getText();
				String amount = amconv.getText();
				
				double num1 = Double.parseDouble(rate);
				double num2 = Double.parseDouble(amount);
				
				double result = num1 * num2;
				output.setText(String.valueOf((result)));
			}
			catch(Exception error){
				output.setText("Input error");
			}
		}
	}
}