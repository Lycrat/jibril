package AnimalPackage;

public class Lioness extends Animal {

    private boolean isPregnant;


    public Lioness(String name, String diet, boolean isPoisonous, String gender, String region, boolean isPregnant) {
        super(name, diet, isPoisonous, gender, region);
        this.isPregnant = isPregnant;
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    @Override
    public boolean fly(){
        return false;
    }
}
