public class FarmVehicle<P extends Farmer> extends Vehicle<P> implements rideable
{

    public FarmVehicle()
    {
        super();
    }



    public boolean operate(Farm f)
    {

        return false;
    }


}
