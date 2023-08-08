public class Crop extends Food{
    boolean hasBeenHarvested;
    boolean hasBeenFertilized;





    Crop yield(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        if (hasBeenHarvested == true && hasBeenHarvested == true) {
            return this;
        }
        return null;
    }
    void getHarvested(boolean hasBeenHarvested){ this.hasBeenHarvested = hasBeenHarvested;}
    boolean setHarvested(boolean hasBeenHarvested){ return hasBeenHarvested;}
    void getFertilized(boolean hasBeenFertilized){this.hasBeenFertilized = hasBeenFertilized;}
    boolean setFertilized(boolean hasBeenFertilized){return hasBeenFertilized; }


    }

