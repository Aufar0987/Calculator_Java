package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Models.CalculatorModel;
import View.CalculatorView;



public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			int thirdNumber, fourthNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			String buttonText = ((JButton) e.getSource()).getText();
			
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                thirdNumber = theView.getThirdNumber();
                fourthNumber = theView.getFourthNumber();

                if ("Calculate1".equals(e.getActionCommand())) {
                    theModel.addTwoNumbers(firstNumber, secondNumber);
                    theView.setCalcSolution(theModel.getCalculationValue());
                } else if ("Calculate2".equals(e.getActionCommand())) {
                    theModel.addTwoNumbers2(thirdNumber, fourthNumber);
                    theView.setCalcSolution2(theModel.getCalculationValue2());
                } else {
                    System.out.println("Failed");
                }

            } catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 Integers");
            }
			
			System.out.println(buttonText);
			
		}
		
	}
	
}