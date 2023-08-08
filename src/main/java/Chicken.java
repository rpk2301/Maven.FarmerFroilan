public class Chicken {

    boolean isFertilized;

    boolean isHungry;

    public boolean eat(){
        if(isHungry == true){
            return true;
        }
        return false;
    }
}
