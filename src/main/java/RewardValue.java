public class RewardValue {
    private double cash;
    private int miles;
    public static final double CONVERSION_RATE = 0.0035;

    RewardValue(double cash){
        this.cash = cash;
        miles = convertCashToMiles(this.cash);
    }
    RewardValue(int miles){
        this.miles = miles;
        cash = convertMilesToCash(this.miles);
    }
    private int convertCashToMiles(double cashValue){
        return (int)(cashValue/CONVERSION_RATE);
    }
    private double convertMilesToCash(int milesValue){
        return milesValue*CONVERSION_RATE;
    }
    double getCashValue(){
        return cash;
    }
    int getMilesValue(){
        return miles;
    }
}
