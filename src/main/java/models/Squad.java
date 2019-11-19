package models;
import models.Hero;

import java.util.ArrayList;
import java.util.List;

public class Squad {

    private  ArrayList<Hero> squadMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();
    private int squadId;
    private String squadPurpose;
    private String squadName;
    private int maxSize;

    public Squad(String squadName, int maxSize, String squadPurpose) {
        this.squadName = squadName;
        this.maxSize = maxSize;
        this.squadPurpose = squadPurpose;
        this.squadMembers = new ArrayList<>();
        instances.add(this);
        this.squadId = instances.size();

    }

    public int getSquadId(){
        return squadId;
    }
    public static Squad findBySquadId(int id) {
        return instances.get(id-1);
    }
    public String getSquadName() {
        return squadName;
    }
    public int getMaxSize() {
        return maxSize;
    }
    public String getCause() {
        return this.squadPurpose;
    }
    public static ArrayList<Squad> getInstances(){
        return instances;
    }
    public ArrayList<Hero> getSquadMembers(){
        return squadMembers;
    }
    public void setSquadMembers(Hero newMember) {
        squadMembers.add(newMember);
    }
    public static void clearAllSquads(){
        instances.clear();
    }
    public void clearAllSquadMembers(){
        getSquadMembers().clear();
    }

    public static Squad setUpNewSquad1(){return new Squad("Avengers",5,"INFINITY STONE");}
    public static Squad setUpNewSquad2(){return new Squad("GameBoy",5,"PEACE");}

}
