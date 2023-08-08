import java.util.ArrayList;
import java.util.List;


public class ChickenCoop extends Storage<Chicken>{

    ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public void addChicken(Chicken chicken){
        chickens.add(chicken);

    }

    public List<Chicken> getChickens(){
        return chickens;
    }

    public Chicken getChicken(int index){
        if (index >= 0 && index < chickens.size()) {
            return chickens.get(index);
        }
        return null;

    }
    }

