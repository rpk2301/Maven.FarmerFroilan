import java.util.ArrayList;

public abstract class Animal implements  Eater, NoiseMaker
{

String name;
ArrayList<Food> inStomach = new ArrayList<Food>();






public void eat(Edible p)
{
    inStomach.add(p);
}

}
