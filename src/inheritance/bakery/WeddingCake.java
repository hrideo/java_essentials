package inheritance.bakery;

public class WeddingCake extends Cake {

    private int tiers;

    public WeddingCake() {
        //calling constructor of superclass Cake using keyword super()
        super("almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
