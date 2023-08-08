

public class Chicken {

    public String getName() {
        return name;
    }

    private String name;
    public Chicken(String littleChick)
    {
        this.name = littleChick;
    }

    public boolean isFertilized() {
        return isFertilized;
    }

    public void setFertilized(boolean fertilized) {
        isFertilized = fertilized;
    }

    private boolean isFertilized;



    public Food yield(boolean y)
    {
        if(isFertilized ==true)
        {
            return null;
        }
        else return new EdibleEgg();
    }


}
