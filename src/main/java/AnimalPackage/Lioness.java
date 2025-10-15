package AnimalPackage;

import ExceptionPackage.LionessCubOverloadException;
import java.util.Random;

public class Lioness extends Animal {

    private boolean isPregnant;


    private int cubCount;

    public Lioness(String name, String diet, boolean isPoisonous, String gender, String region, boolean isPregnant, int cubCount) throws LionessCubOverloadException {
        super(name, diet, isPoisonous, gender, region);
        this.isPregnant = isPregnant;
        this.setCubCount(cubCount);
    }

    public boolean isPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    public int getCubCount() {
        return cubCount;
    }

    public void setCubCount(int cubCount) throws LionessCubOverloadException{
        if (cubCount > 10){
            throw new LionessCubOverloadException("Lioness would definitely not have more than 10 cubs");
        }
        this.cubCount = cubCount;
    }

    public void breed() {
        if (isPregnant) {
            System.out.println(getName() + " breeding");
        }

        Random rand = new Random();
        boolean success = rand.nextBoolean();
        if (success) {
            isPregnant = true;
            System.out.println(getName() + " has become pregnant");
        } else {
            isPregnant = false;
            System.out.println(getName() + " has not become pregnant. Try again");
        }
    }

    @Override
    public boolean fly(){
        return false;
    }

    @Override
    public void makeNoise(){
        System.out.println("RAWR MATE");
    };
}
