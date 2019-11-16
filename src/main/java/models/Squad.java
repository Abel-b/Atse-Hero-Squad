//package models;
//import models.Hero;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Squad {
//
//    private List<Hero> mSquadMembers = new ArrayList<>();
//    private static ArrayList<Hero> heroInstances = new ArrayList<>();
//    private String mSquadName;
//    private int mMaxSize;
//
//    public Squad(String mSquadName, int mMaxSize) {
//        this.mSquadName = mSquadName;
//        this.mMaxSize = heroInstances.size();
//    }
//
//    public List<Hero> getSquadMembers() {
//        return mSquadMembers;
//    }
//
//    public String getSquadName() {
//        return mSquadName;
//    }
//
//    public static ArrayList<Hero> getMaxSize(){
//        return heroInstances;
//    }
//
//    public String addHero(Hero newHero) {
//        if (mMaxSize <= 3) {
//            mSquadMembers.add(newHero);
//            mMaxSize++;
//            return "Hero successfully added!";
//        } else {
//            return "Squad is full. Create a new Squad.";
//        }
//    }
//}
//
//
