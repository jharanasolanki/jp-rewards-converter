public class RewardValue {
    double cash;
    int miles;
    final double conversion_rate = 0.0035;
    RewardValue(double cash){
        this.cash = cash;
    }
    RewardValue(int miles){
        this.miles = miles;
    }
    double getCashValue(){
        cash = miles/conversion_rate;
        return cash;
    }
    int getMilesValue(){
        miles = (int)(cash*conversion_rate);
        return miles;
    }
}
