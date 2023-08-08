import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Person <T extends  Edible, r extends  rideable, a extends  Animal> implements Rider {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    boolean isHungry;
    private ArrayList<T>  inStomach = new ArrayList<T>();

    public Person(String name)
    {
        this.name = name;
    }


    public  void eat(T... edible)
    {
    for(T list: edible)
    {
        inStomach.add(list);
    }
    }

    public <r> boolean Mount(r rideable) {

       return false;
    }


    public String makenoise()
    {
    return "Hi!";
    }


    public<a,T> boolean Feed(a animal,T...edible)
    {
    return true;

    }





}
