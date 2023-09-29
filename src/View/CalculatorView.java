package View;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorView extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate1");
	private JTextField calcSolution = new JTextField(10);
	private JTextField thirdNumber = new JTextField(10);
	private JTextField fourthNumber = new JTextField(10);
	private JLabel multiplyJLabel = new JLabel("*");
	private JButton calculateButton2 = new JButton("Calculate2");
	private JTextField calcSolution2 = new JTextField(10);


	public CalculatorView(){
		
		// Sets up the view and adds the components
		
		this.setTitle("Calculator");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);


		firstNumber.setBounds(50, 50, 100, 30);
		this.add(firstNumber);
		
		additionLabel.setBounds(160, 50, 10, 30);
		this.add(additionLabel);
		
		secondNumber.setBounds(180, 50, 100, 30);
		this.add(secondNumber);
		
		calculateButton.setBounds(300, 50, 100, 30);
		this.add(calculateButton);
		
		calcSolution.setBounds(420, 50, 100, 30);
		this.add(calcSolution);


		thirdNumber.setBounds(50, 100, 100, 30);
		this.add(thirdNumber);

		multiplyJLabel.setBounds(160, 100, 10, 30);
		this.add(multiplyJLabel);
		
		fourthNumber.setBounds(180, 100, 100, 30);
		this.add(fourthNumber);
		

		calculateButton2.setBounds(300, 100, 100, 30);
		this.add(calculateButton2);
		
		calcSolution2.setBounds(420, 100, 100, 30);
		this.add(calcSolution2);


	
		this.setVisible(true);

		// End of setting up the components --------
		
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}

	public int getThirdNumber(){
		
		return Integer.parseInt(thirdNumber.getText());
		
	}
	
	public int getFourthNumber(){
		
		return Integer.parseInt(fourthNumber.getText());
		
	}
	
	public int getCalcSolution(){
		
		return Integer.parseInt(calcSolution.getText());
		
	}
	public int getCalcSolution2(){
		
		return Integer.parseInt(calcSolution2.getText());
		
	}
	
	public void setCalcSolution(int solution){
		
		calcSolution.setText(Integer.toString(solution));
		
	}

	public void setCalcSolution2(int solution){
		
		calcSolution2.setText(Integer.toString(solution));
		
	}
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	public void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
		calculateButton2.addActionListener(listenForCalcButton);
		
	}

	

	
	
	// Open a popup that contains the error message passed
	
	public void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}