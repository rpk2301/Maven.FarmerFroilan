public class CropDuster extends FarmVehicle<Pilot> implements Aircraft {



public boolean fertilize(CropRow p)
{
return false;
}

public boolean fertilize(CropRow... c)
{
return true;
}
    public boolean fly(Field p) {
        return false;
    }

    @Override
    public boolean fly() {
        return false;
    }
}
