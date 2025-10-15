package SuperheroPackage;

public abstract class Superhero {
    private String realName;
    private String superheroName;
    private String universe;
    private String power;
    private String gender;


    public Superhero(String realName, String superheroName, String universe, String power, String gender) {
        this.realName = realName;
        this.superheroName = superheroName;
        this.universe = universe;
        this.power = power;
        this.gender = gender;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
