import org.junit.*;


public class ChickenTest {


    @Test
    public void TestYieldTrue()
    {
        //Given
        Chicken chicken = new Chicken("Jeff");
        boolean trueee = true;

        //When
       EdibleEgg food = (EdibleEgg) chicken.yield(trueee);

       //Then
       Assert.assertTrue(food instanceof EdibleEgg);

    }



    @Test
    public void TestYieldFalse()
    {
        //Given
        Chicken chicken = new Chicken("Jeff");
        boolean falseee = false;

        //When
        NonEdibleEgg food = (NonEdibleEgg) chicken.yield(false);

        //Then
        Assert.assertTrue(food instanceof NonEdibleEgg);

    }





}
