package AnimalPackage;

import com.panya.IFlyable;

public abstract class Animal implements IFlyable {
    private String name;
    private String diet;
    private boolean isPoisonous;
    private String gender;
    private String region;

    public Animal(String name, String diet, boolean isPoisonous, String gender, String region) {
        this.name = name;
        this.diet = diet;
        this.isPoisonous = isPoisonous;
        this.gender = gender;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
