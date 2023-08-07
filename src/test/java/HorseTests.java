import  org.junit.*;



public class HorseTests {


@Test
public void makeNoiseTest()
{
    //Given
    Horse horse = new Horse();
    //When
    String actual = horse.makeNoise();
    //Then
    String expected = "Bark";
    Assert.assertEquals(actual,expected);
}
@Test
    public void testEat()
{
    //Given
    Horse horse = new Horse();
    //When
    horse.eat(new EddibleEarCorn);
    //Then
    Assert.assertTrue(horse.stomach.size()>0);
}

@Test
    public void








}
