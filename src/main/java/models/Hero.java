package models;

import java.util.ArrayList;

public class Hero {

    private String heroName;
    private int heroAge;
    private String superPower;
    private String weakness;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int mAttack;
    private int mDefense;
    private int mHealth;


    public Hero(String heroName, int heroAge, String superPower, String weakness) {
        this.heroName = heroName;
        this.heroAge = heroAge;
        this.superPower = superPower;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
        mAttack = 25;
        mDefense = 15;
        mHealth = 100;

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

    public int getmAttack() {
        return mAttack;
    }

    public int getmDefense() {
        return mDefense;
    }

    public int getmHealth() {
        return mHealth;
    }
    public void attacks(Hero opponent){
        opponent.mHealth -= mAttack;
    }
    public void defends(){
        mHealth += 6;
    }
}
