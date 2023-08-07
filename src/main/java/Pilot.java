public class Pilot extends Farmer implements Rider {




    Aircraft aircraft;

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }


    public boolean Mount() {
        return false;
    }
}
