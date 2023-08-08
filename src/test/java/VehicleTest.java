import org.junit.Assert;
import org.junit.Test;
public class VehicleTest {
    @Test
    public void setRiderTest() {
        //Given
        Vehicle vehicle = new Vehicle();

        //When
        Farmer person1 = new Farmer("Froilan");
        vehicle.setRider(person1);


        //Then
        Farmer expected = (Farmer) vehicle.getRider();

        Assert.assertEquals(person1,expected);


    }//

    @Test
    public void makeNoiseTest() {
        //Given
        Vehicle vehicle = new Vehicle();

        //When
        String actual = vehicle.makeNoise();

        //Then
        String expected = "Vroom Vroom";
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void setisMountedTest() {

        //Given
        Vehicle vehicle = new Vehicle();
        Farmer person = new Farmer("Froilan");
        boolean truee = true;

        //When
        Boolean actual = vehicle.isMounted();

        //Then
        boolean expected = true;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void TractorTest() {

        FarmVehicle tractor = new Tractor();
        Farm farm = new Farm();

        Boolean actual = tractor.operate(farm);

        Assert.assertTrue(actual);

    }

    @Test
    public void TractorHarvestTest() {
        Tractor tractor = new Tractor();
        Farm farm = new Farm();
        boolean truee = true;


        boolean actual = tractor.harvest(new Crop());


        Assert.assertTrue(actual);

    }

    @Test
    public void TractorSetRiderTest() {
        //Given
        FarmVehicle tractor = new Tractor();
        Farm farm = new Farm();
        Person  farmer = new Farmer("Froilan");


        //When
        tractor.setRider(farmer);

        //Then
        Farmer expected = (Farmer) tractor.getRider();

        Assert.assertEquals(expected, farmer);

    }
    @Test
    public void CropDusterFertilizeTest(){

        CropDuster cropduster = new CropDuster();
        Pilot  pilot = new Pilot();
        CropRow crops = new CropRow();


        boolean actual = cropduster.fertilize(crops);

        Assert.assertFalse(actual);

    }


}