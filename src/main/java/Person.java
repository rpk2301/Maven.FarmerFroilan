import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Person <T extends  Edible, r extends  rideable, a extends  Animal> implements Rider {

    String name;
    boolean isHungry;
    private ArrayList<T>  inStomach = new ArrayList<T>();


    public  void eat(T... edible)
    {
    for(T list: edible)
    {
        inStomach.add(list);
    }
    }

    public <r> boolean Mount(r rideable) {

        rideable.
    }

    public <r> boolean Dismount() {

        return false;
    }

    public String makenoise() {

    }

    public boolean RideAllHorses()
    {

    }

    public<a,T> boolean Feed(a animal,T...edible)
    {


    }





}
