import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTests {


    @Test
    public void addStableTest()
    {
    //Given
        Farm farm = new Farm();
    //When
     boolean expected = true;
     boolean actual= farm.addStable(new Stable());
    //Then
    Assert.assertEquals(expected,actual);
    }
    @Test
    public void addCoopTest()
    {
        //Given

        Farm farm = new Farm();
        //When
        boolean expected = true;
        boolean actual= farm.addCoop(new chickenCoop());
        //Then
        Assert.assertEquals(expected,actual);
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
        ArrayList<chickenCoop> chickencoops = farm.getCoops();
        Assert.assertEquals(chickencoops.size(),0);
    }



}
