package AnimalPackage;

import ExceptionPackage.LionessCubOverloadException;

public class Lioness extends Animal {

    private boolean isPregnant;


    private int cubCount;

    public Lioness(String name, String diet, boolean isPoisonous, String gender, String region, boolean isPregnant, int cubCount) {
        super(name, diet, isPoisonous, gender, region);
        this.isPregnant = isPregnant;
        this.cubCount = cubCount;
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

    public void setCubCount(int cubCount) throws LionessCubOverloadException {
        if (cubCount > 10){
            throw new LionessCubOverloadException("Lioness would definitely not have more than 10 cubs");
        }
        this.cubCount = cubCount;
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
