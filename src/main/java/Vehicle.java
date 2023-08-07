public class Vehicle<p extends Person> implements rideable, NoiseMaker {


p rider;

    boolean isMounted = false;


public String makeNoise()
{
    return "Vroom Vroom";
}

public void setRider(p riderr)
{
    this.rider = riderr;
}

public p getRider()
{
    return rider;
}


    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }


    public String MakeNoise() {
        return "Vroom Vroom";
    }
}
