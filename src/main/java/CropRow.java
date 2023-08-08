import java.util.ArrayList;

public class CropRow <c extends Crop>{


    private boolean isFertilized;



    ArrayList<c> croprow = new ArrayList<>();


    public ArrayList<c> getCroprow() {
        return croprow;
    }

    public boolean isFertilized() {
        return isFertilized;
    }

    public boolean plant(c plant)
    {
        croprow.add(plant);
        return true;
    }



}
