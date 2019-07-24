package za.co.diputu.model;

public class NewHeroModel {
    private int calculationValue;
    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }
    public int getCalculationValue(){
        return calculationValue;
    }
}
