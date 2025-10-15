package SuperheroPackage;


import com.panya.IFlyable;

import java.util.Optional;

public abstract class Superhero implements IFlyable {
    private String realName;
    private String superheroName;
    private String universe;
    private Optional<String> power;
    private String gender;


    private int health;


    public Superhero(String realName, String superheroName, String universe, String power, String gender) {
        this.realName = realName;
        this.superheroName = superheroName;
        this.universe = universe;
        this.power = Optional.of(power);
        this.gender = gender;
        this.health = 100;
    }

     public abstract void saySignaturePhrase();

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

    public Optional<String> getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = Optional.of(power);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHealth() {
        return health;
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0){
            health = 100;
            System.out.println("Rebooting......");
            System.out.println(superheroName + " is Rejuvenated, health is at " + health);
            return;
        }
        System.out.println(superheroName + " takes damage: " + damage);
    }

    public void eat(String food) {
        if (food.equals("energy bar")){
            health += 10;
        }else if (food.equals("chicken bar")) {
            health += 20;
        }

        if (health > 100 || food.equals("V Serum")){
            health = 100;
        }
        System.out.println(superheroName + " eats food: " + food);
    }
}
