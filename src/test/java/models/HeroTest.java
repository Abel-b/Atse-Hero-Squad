package models;

import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HeroTest {

    @Test
    public void checksObjectInstantiatesCorrectly_true() throws Exception{
        Hero hero = new Hero("Javaman", 20, "Code anything", "Needs Coffee to function");
        boolean expected = true;
        assertTrue(expected);
    }
    @Test
    public void testsGetterMethods_getHeroName()throws Exception{
        Hero hero = setupNewHero();
        String expected = "Javaman";
        assertEquals(expected, hero.getHeroName());
    }
    @Test
    public void testsGetterMethods_getHeroAge()throws Exception{
        Hero hero = setupNewHero();
        int expected = 20;
        assertEquals(expected, hero.getHeroAge());
    }
    @Test
    public void testsGetterMethods_getSuperPower()throws Exception{
        Hero hero = setupNewHero();
        String expected = "Code anything";
        assertEquals(expected, hero.getSuperPower());
    }
    @Test
    public void testsGetterMethods_getWeakness()throws Exception{
        Hero hero = setupNewHero();
        String expected = "Needs Coffee to function";
        assertEquals(expected, hero.getWeakness());
    }
    @Test
    public void SetsSetterMethods_setsName_true()throws Exception{
        Hero post = setupNewHero();
        post.setHeroName("New name");
        String expected = "New name";
        assertEquals(expected, post.getHeroName() );
    }
    @Test
    public void SetsSetterMethods_setsAge_true()throws Exception{
        Hero post = setupNewHero();
        post.setHeroAge( 27);
        int expected = 27;
        assertEquals(expected, post.getHeroAge());
    }
    @Test
    public void SetsSetterMethods_setsSuperPower_true()throws Exception{
        Hero post = setupNewHero();
        post.setSuperPower("Fire");
        String expected = "Fire";
        assertEquals(expected, post.getSuperPower());
    }
    @Test
    public void SetsSetterMethods_setsWeakness_true()throws Exception{
        Hero post = setupNewHero();
        post.setWeakness("None");
        String expected = "None";
        assertEquals(expected, post.getWeakness() );
    }

    public Hero setupNewHero() {
        return new Hero("Javaman", 20, "Code anything", "Needs Coffee to function");

    }

}