import java.util.ArrayList;
import java.util.List;

public class Stable {
    ArrayList<Horse> horses = new ArrayList<Horse>();


    public void addHorses(Horse horse){
        horses.add(horse);

    }

    public List<Horse> getHorses(){
        return horses;
    }

    public Horse getHorses(int index){
        if (index >= 0 && index < horses.size()) {
            return horses.get(index);
        }
        return null;

    }
}

