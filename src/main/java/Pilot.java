public class Pilot extends Farmer {




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
