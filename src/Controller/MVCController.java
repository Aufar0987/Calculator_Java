package Controller;

import Models.CalculatorModel;
import View.CalculatorView;

public class MVCController {

    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        new CalculatorController(theView, theModel);
    }
    
}