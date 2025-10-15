package SuperheroPackage;

public class Spiderman extends Superhero{

    private boolean isSuitedUp;
    private String suit;

    public Spiderman(String realName, String superheroName, String universe, String power, String gender,  boolean isSuitedUp, String suit) {
        super(realName, superheroName, universe, power, gender);
        this.isSuitedUp = isSuitedUp;
        this.suit = suit;
    }

    @Override
    public boolean fly() {
        return false;
    }

    public boolean isSuitedUp() {
        return isSuitedUp;
    }

    public void setSuitedUp(boolean suitedUp) {
        isSuitedUp = suitedUp;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
