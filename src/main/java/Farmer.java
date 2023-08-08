public class Farmer<e extends Edible,t extends Tractor,a extends Animal> extends Botanist implements Rider{

    Farm froilansFarm;

    public Farmer(String froilan)
    {
        super(froilan);
    }
    public boolean Mount() {
        return false;
    }
}
