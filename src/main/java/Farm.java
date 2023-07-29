import java.util.ArrayList;

public class Farm
{
  private ArrayList<Stable> stables = new ArrayList<Stable>();
  private ArrayList<chickenCoop>coops = new ArrayList<chickenCoop>();
  private Farmhouse farmhouse=new Farmhouse();
  private ArrayList<Field> fields = new ArrayList<Field>();
  private ArrayList <Vehicle> vehicles = new ArrayList<Vehicle>();

  String dayOfWeek;

public Farm()
{

}





public boolean addStable(Stable stable)
{
  int current = this.stables.size();
  this.stables.add(stable);
  int after = this.stables.size();
  if(after==current+1)
  {
    return true;
  }
  return false;
}

  public boolean addCoop(chickenCoop coop)
  {
    int current = this.coops.size();
    this.coops.add(coop);
    int after = this.coops.size();
    if(after==current+1)
    {
      return true;
    }
    return false;
  }

  public ArrayList<chickenCoop> getCoops()
  {
    return this.coops;
  }



public ArrayList<Stable> getStables()
{
  return this.stables;
}


}

