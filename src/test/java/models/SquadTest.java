//package models;
//import models.Hero;
//import org.junit.Test;
//import org.junit.Assert.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//public class SquadTest {
//
//    @Test
//    public void squadTest_instantiatesCorrectly_true() throws Exception{
//        Squad squad = new Squad("Suicide", 3);
//        boolean expected = true;
//        assertTrue(expected);
//    }
//    @Test
//    public void squadTest_testsGetterMethods_getSquadName()throws Exception{
//        Squad squad = setupNewSquad();
//        String expected = "Name";
//        assertEquals(expected, squad.getSquadName());
//    }
//    @Test
//    public void squadTest_testsGetterMethods_getSquadMembers()throws Exception{
//        Squad squad = setupNewSquad();
//        Hero hero = new Hero("Abel", 20, "Coffee", "Coffee");
//        List<Hero> expected = new ArrayList<>();
//        assertEquals(expected, squad.getSquadMembers());
//    }
//    @Test
//    public void squadTest_testsGetterMethods_getMaxSize()throws Exception{
//        Squad squad = setupNewSquad();
//        Hero hero = new Hero("csc", 3, "cx", "sacxs");
//        Hero hero1 = new Hero("csc", 3, "cx", "sacxs");
//        Hero hero3 = new Hero("csc", 3, "cx", "sacxs");
//        int expected = 1;
//        assertEquals(expected, Squad.getMaxSize().size());
//    }
//
//
//    private Squad setupNewSquad() {
//        return new Squad("Name", 3);
//    }
//
//
//}