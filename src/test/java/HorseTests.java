import  org.junit.*;



public class HorseTests {


@Test
public void makeNoiseTest()
{
    //Given
    Horse horse = new Horse("Jeff");
    //When
    String actual = horse.MakeNoise();
    //Then
    String expected = "MurMurMur";
    Assert.assertEquals(actual,expected);
}
@Test
    public void testEat()
{
    //Given
    Horse horse = new Horse("Jeff");
    //When
    horse.eat(new EdibleEarCorn());
    //Then
    Assert.assertTrue(horse.getInStomach().size()>0);
}










}
