package inheritance.bakery;

public class BirthdayCake extends Cake {

    public BirthdayCake(){
        setFlavor("chocolate");
    }

    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
