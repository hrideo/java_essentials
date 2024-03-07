package inheritance.bakery;

public class WeddingCake extends Cake {

    public WeddingCake() {
        setFlavor("almond");
    }

    private int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
