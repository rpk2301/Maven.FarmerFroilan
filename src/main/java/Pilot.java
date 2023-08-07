public class Pilot extends Person implements Rider<Aircraft>{




    Aircraft aircraft;

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }


}
