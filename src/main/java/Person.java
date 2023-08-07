import java.util.HashMap;

public abstract class Person <T extends  Edible, r extends  rideable, a extends  Animal> {

    String name;
    boolean isHungry;
    HashMap<T, Integer> inStomach;


    public <T> void eat(T... edible) {

    }

    public <r> void Mount() {

    }

    public <r> void Dismount() {

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
