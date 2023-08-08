import java.util.ArrayList;

public class Horse <e extends EdibleEarCorn> implements rideable, NoiseMaker {


    boolean isHungry = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Horse(String bigHorse) {
    }

    public ArrayList<e> getInStomach() {
        return inStomach;
    }

    public void setInStomach(ArrayList<e> inStomach) {
        this.inStomach = inStomach;
    }

    private ArrayList<e> inStomach = new ArrayList<>();

    public void setRidden(boolean ridden) {
        IsRidden = ridden;
    }

    private boolean IsRidden = false;

    public boolean isHungry() {
        return isHungry;
    }

    public boolean getIsRidden() {
        return IsRidden;
    }

    @Override
    public String MakeNoise()
    {
        return "MurMurMur";
    }

    public void eat(e food)
    {
        inStomach.add(food);
    }
}
