import java.util.ArrayList;

public class Stable {



    ArrayList<Horse> horses = new ArrayList<Horse>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public void addHorse(Horse p)
    {
        horses.add(p);
    }




}
