/*
 * Angelo Kyle E. Mamainte
 * ITCC 11 A
 * Converter Midterm Program
 * Oct 12, 2020
 */
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
class CalculatorConverter{
	
	private JFrame mainFrame;
	private JPanel mainPanel;
	private JPanel buttonPanel;
	private GridLayout grid;
	private BorderLayout border;
	private JTextField amount;
	private Font font;
	private JTextField conversion;
	private JTextField rate;
	private JButton Convert;
	private JLabel Rate;
	private JLabel Converter;
	private JLabel Amount;
	private Font Font;
	private ActionListener buttonActionListener;
	double num1 = 0;
	double num2 = 0;
	double convert = 0;
	char conv;
	
	
			
	public CalculatorConverter(){
		
		// Constructor
		mainFrame = 	new JFrame("Currency Converter");
		mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
		
		// Operations
		buttonActionListener = new MyActionListener();
		
		// Fonts and Borders
		font = 			new Font(Font.SANS_SERIF , Font.BOLD, 26);
		amount = 		new JTextField(15);
		amount.setFont(font);
		conversion = 	new JTextField (15);
		conversion.setFont(font);
		rate = 			new JTextField(15);
		rate.setFont(font);
		border = 		new BorderLayout();
		grid = 			new GridLayout(5,1);
		mainPanel = 	new JPanel(border);
		buttonPanel = 	new JPanel(grid);

		// Numbers
		Convert = 		new JButton("Convert");
		Convert.addActionListener(buttonActionListener);
		Convert.setFont(font);
		Amount =       new JLabel ("Amount");
		Amount.setFont(font);
		Converter =     new JLabel ("Conversion");
		Converter.setFont(font);
		Rate =       new JLabel ("Rate");
		Rate.setFont(font);
		
		
		//adding the buttons
		buttonPanel.add(Rate);
		buttonPanel.add(rate);
		buttonPanel.add(Amount);
		buttonPanel.add (amount);
		buttonPanel.add(Converter);
		buttonPanel.add(conversion);
		buttonPanel.add(Convert);


		mainPanel.add(buttonPanel, BorderLayout.CENTER);
		mainFrame.add(mainPanel);
		
		mainFrame.pack();
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		
		}
		
		 class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                
				String Input = rate.getText();
                String Input2 = amount.getText();
                
				double num1 = Double.parseDouble(Input);
                double num2 = Double.parseDouble(Input2);
                double conv = num1 * num2;
                
				conversion.setText(String.valueOf((conv)));
            
			} catch (Exception error) {
                conversion.setText("ERROR PLEASE TRY AGAIN");
            }
        }

		


		
	
		 }	
}   