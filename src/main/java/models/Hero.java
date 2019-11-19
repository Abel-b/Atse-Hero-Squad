package models;

import java.util.ArrayList;

public class Hero {

    private String heroName;
    private int heroAge;
    private String superPower;
    private String weakness;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList<>();


    public Hero(String heroName, int heroAge, String superPower, String weakness) {
        this.heroName = heroName;
        this.heroAge = heroAge;
        this.superPower = superPower;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
        int mAttack = 25;
        int mDefense = 15;
        int mHealth = 100;

    }

    public String getHeroName() {
        return this.heroName;
    }
    public int getHeroAge(){
        return this.heroAge;
    }
    public String getSuperPower(){
        return this.superPower;
    }
    public String getWeakness(){
        return this.weakness;
    }
    public static  ArrayList<Hero> getAllInstances(){
        return instances;
    }
    public static void clearAllHeroes(){
        instances.clear();
    }
    public int getId(){
        return id;
    }

    public void setHeroName(String heroName){
        this.heroName = heroName;
    }
    public void setHeroAge(int heroAge){
        this.heroAge = heroAge;
    }
    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }
    public void setWeakness(String weakness){
        this.weakness = weakness;
    }

    public static Hero findById(int id){
        return instances.get(id-1);
    }



    public static Hero setUpNewHero(){
        return new Hero("Fasika",23,"flying","Fire");
    }
    public static Hero setUpNewHero1(){
        return new Hero("Hannah",20,"Night Vision","Light");
    }
    public static Hero setUpNewHero2(){
        return new Hero("Jay",30,"24hrs up","Coffee");
    }

}
