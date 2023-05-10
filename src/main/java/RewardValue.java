public class RewardValue {
    private double cashValue;
    private int  milesValue;
    final private static double MILES_TO_CASH_RATE=0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue(){
        return milesValue*MILES_TO_CASH_RATE;
    }

    public double getMilesValue(){

        return cashValue/MILES_TO_CASH_RATE;
    }
}
