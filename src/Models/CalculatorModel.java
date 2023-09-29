package Models;

public class CalculatorModel {
    private int calculationValue;
    private int CalculationValue2;

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = (firstNumber + secondNumber);
    }

    public void addTwoNumbers2(int thirdNumber, int fourthNumber) {
        CalculationValue2 = (thirdNumber * fourthNumber);
    }
    
    public int getCalculationValue() {
        return calculationValue;
    }
    
    public int getCalculationValue2() {
        return CalculationValue2;
    }
}
