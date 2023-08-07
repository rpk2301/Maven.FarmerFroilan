import java.util.ArrayList;

public class CropRow <c extends Crop> {

    ArrayList<c> croprow = new ArrayList<c>();
     boolean isFertilized;

    void getisFertilized(boolean isFertilized){this.isFertilized = isFertilized;}
    boolean setisFertilized(boolean isFertilized){return isFertilized; }

    boolean plant(String c){return true;}

}
