public class Horse implements rideable {


    boolean isHungry = true;

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

}
