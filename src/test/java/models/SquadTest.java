package models;
import models.Hero;
import org.junit.Test;
import org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquadTest {

    @Test
    public void newSquad_instantiatesCorrectly_true() {
        Squad newSquad = setUpNewSquad();
        assertTrue(newSquad instanceof Squad);
    }
    @Test
    public void newSquad_getName_String() {
        Squad newSquad = setUpNewSquad();
        assertEquals("Name",newSquad.getSquadName());
    }
    @Test
    public void newSquad_getSize_Int() {
        Squad squad = setUpNewSquad();
        assertEquals(3, squad.getMaxSize());
    }
    @Test
    public void newSquad_getPower_String() {
        Squad newSquad = setUpNewSquad();
        assertEquals("SOMETHING",newSquad.getCause());
    }
    @Test
    public void newSquad_getInstances_true() {
        Squad newSquad = setUpNewSquad();
        Squad another = setUpNewSquad();
        assertTrue(Squad.getInstances().contains(newSquad));
        assertTrue(Squad.getInstances().contains(another));
    }
    @Test
    public void newSquad_getSquadMembers_Array() {
        Squad newSquad = setUpNewSquad();
        Hero newHero = Hero.setUpNewHero();
        Hero newHero1 = Hero.setUpNewHero1();
        newSquad.setSquadMembers(newHero);
        assertEquals("Fasika",newSquad.getSquadMembers().get(0).getHeroName());
    }

    @Test
    public void newSquad_allTestSquadMembers_Array() {
        Hero newHero = Hero.setUpNewHero();
        Squad newSquad = setUpNewSquad();
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals("Fasika",newSquad.getSquadMembers().get(0).getHeroName());
    }
    @Test
    public void addMember_addsMemberToSquad_Hero(){
        Hero newHero = Hero.setUpNewHero();
        Squad testSquad = setUpNewSquad();
        Squad newSquad = Squad.findBySquadId(1);
        newSquad.clearAllSquadMembers();
        newSquad.getSquadMembers().add(newHero);
        newSquad.getSquadMembers().add(newHero);
        assertEquals(2,newSquad.getSquadMembers().size());
    }

    @Test
    public void setNewMember_hero(){
        Hero.clearAllHeroes();
        Hero newHwero = Hero.setUpNewHero();
        Squad testSquad = setUpNewSquad();
        testSquad.setSquadMembers(newHwero);

        assertEquals(1,testSquad.getSquadMembers().get(0).getId());
    }



    private Squad setUpNewSquad() {
        return new Squad("Name", 3, "SOMETHING");
    }


}
