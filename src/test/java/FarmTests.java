import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTests {


    @Test
    public void addStableTest() {
        //Given
        Farm farm = new Farm();
        //When
        boolean expected = true;
        boolean actual = farm.addStable(new Stable());
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStableTest() {
        //Given
        Farm farm = new Farm();
        boolean expected = true;
        //When
        farm.addStable(new Stable());
        boolean actual = farm.removeStable(0);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCoopTest() {
        //Given
        Farm farm = new Farm();
        boolean expected = true;
        //When
        farm.addCoop(new ChickenCoop());
        boolean actual = farm.removeCoop(0);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeFarmHouse() {
        //Given
        Farm farm = new Farm();
        //When
        farm.removeFarmHouse();
        //Then
        Assert.assertNull(farm.getFarmhouse());
    }

    @Test
    public void TestCheckHoses() {
        Farm farm = new Farm();

        boolean expected = true;
        boolean actual = farm.CheckHorses(farm.getStables());
    }

    @Test
    public void testgetFields()
    {
        //Given
        Farm farm = new Farm();

        //When
        ArrayList<Field> fields = farm.getfields();

        //Then
        Assert.assertNotNull(fields);
    }

    @Test
    public void testGetVehicles()
    {
        //Given
        Farm farm = new Farm();

        //When
        ArrayList<Vehicle>vehicles = farm.getVehicles();

        //Then
        Assert.assertNotNull(vehicles);
    }


    @Test
    public void testgetDayOfWeek()
    {
        //Given
        Farm farm = new Farm();

        //When
        String ret = farm.getDayOfWeek();

        //Then
        Assert.assertNotNull(ret);
    }

    @Test
    public void testSetDayOfWeek()
    {
        //Given
        Farm farm = new Farm();
        //When
        farm.SetDayOfWeek("Friday");
        //Then
        Assert.assertEquals("Friday",farm.getDayOfWeek());
    }

    @Test
    public void testAddField()
    {
        //Given
        Farm farm = new Farm();
        //When
       boolean Actual = farm.addFields(new Field());

        //Then
        Assert.assertTrue(Actual);

    }


    @Test
    public void testResetHorses()
    {
        Farm farm = new Farm();

        Boolean actual = farm.resetHorses();

        Assert.assertTrue(actual);
    }



    @Test
    public void addCoopTest()
    {
        //Given
        Farm farm = new Farm();
        //When
        boolean expected = true;
        boolean actual= farm.addCoop(new ChickenCoop());
        //Then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void getFarmHouse()
    {
    Farm farm = new Farm();
    Farmhouse newFarmHouse = farm.getFarmhouse();
    Assert.assertNotNull(newFarmHouse);
    }



    @Test
    public void getStables()
    {
        Farm farm = new Farm();
        ArrayList<Stable> stables = farm.getStables();
        Assert.assertEquals(stables.size(),0);
    }


    @Test
    public void getCoopsTest()
    {
        Farm farm = new Farm();
        ArrayList<ChickenCoop> chickencoops = farm.getCoops();
        Assert.assertEquals(chickencoops.size(),0);
    }



}
