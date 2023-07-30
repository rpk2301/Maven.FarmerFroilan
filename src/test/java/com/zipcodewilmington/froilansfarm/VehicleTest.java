package com.zipcodewilmington.froilansfarm;
import org.junit.Assert;
import org.junit.Test;
public class VehicleTest {
    @Test
    public void setRiderTest() {
        //Given
        Vehicle vehicle = new Vehicle;

        //When
        Person person1 = new Person("Froilan");
        vehicle.setRider(person1);


        //Then
        Person expected = vehicle.getRider();

        Assert.assertTrue(expected, person1);


    }

    @Test
    public void makeNoiseTest() {
        //Given
        Vehicle vehicle = new Vehicle;

        //When
        String actual = vehicle.makeNoise();

        //Then
        String expected = "Vroom";
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void setisMountedTest() {

        //Given
        Vehicle vehicle = new Vehicle();
        Person person = new Person();
        boolean truee = true;

        //When
        Boolean actual = vehicle.isMounted(truee);

        //Then
        boolean expected = true;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void TractorTest() {

        FarmVehicle tractor = new Tractor;
        Farm farm = new Farm;

        Boolean actual = tractor.operate(farm);

        Assert.assertTrue(actual);

    }

    @Test
    public void TractorHarvestTest() {
        FarmVehicle tractor = new Tractor;
        Farm farm = new Farm;
        boolean truee = true;


        boolean actual = tractor.havest(crops);

        boolean expected = true;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void TractorSetRiderTest() {
        //Given
        FarmVehicle tractor = new Tractor;
        Farm farm = new Farm;
        Person  farmer = new Farmer("Froilan");


        //When
        tractor.setRider(farmer);

        //Then
        Farmer expected = tractor.getRider();

        Assert.assertTrue(expected, farmer);

    }
    @Test
    public void CropDusterFertilizeTest(){

        FarmVehicle cropduster = new CropDuster;
        Pilot  pilot = new Pilot;

        Boolean expected = true;

        boolean actual = cropduster.fertilize(cropRow);

        Assert.assertTrue(expected,actual);

    }


}