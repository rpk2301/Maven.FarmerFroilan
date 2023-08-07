import org.junit.*;


public class ChickenTest {


    @Test
    public void TestYieldTrue()
    {
        //Given
        Chicken chicken = new Chicken();
        boolean trueee = true;

        //When
       EddibleEgg food = chicken.yield(trueee);

       //Then
       Assert.assertTrue(food instanceof EddibleEgg);

    }



    @Test
    public void TestYieldFalse()
    {
        //Given
        Chicken chicken = new Chicken();
        boolean falseee = false;

        //When
        nonEddibleEgg food = chicken.yield(falsee);

        //Then
        Assert.assertTrue(food instanceof nonEddibleEgg);

    }





}
