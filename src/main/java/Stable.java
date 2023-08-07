import java.util.ArrayList;

public class Stable {

    ArrayList<Horse> horses = new ArrayList<Horse>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public Horse getPerson(int index) {
        if (index >= 0 && index < horses.size()) {
            return horses.get(index);
        }
        return null;

    }




}
