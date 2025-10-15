package SuperheroPackage;

import ExceptionPackage.SpidermanSuitNonExistentException;

public class Spiderman extends Superhero{

    private boolean isSuitedUp;
    private String suit;

    public Spiderman(String realName, String superheroName, String universe, String power, String gender,  boolean isSuitedUp, String suit) throws SpidermanSuitNonExistentException {
        super(realName, superheroName, universe, power, gender);
        this.isSuitedUp = isSuitedUp;
        this.setSuit(suit);


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

    public void setSuit(String suit) throws SpidermanSuitNonExistentException {
        if (!suit.equals("black") && !suit.equals("red")) {
            throw new SpidermanSuitNonExistentException("suit is non-existent");
        }
        this.suit = suit;
    }

    @Override
    public void saySignaturePhrase() {
        System.out.println("*Thwip Thwip* I'm your friendly neighbourhood spiderman");
    }
}
