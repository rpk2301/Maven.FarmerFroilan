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

  public Farmhouse getFarmhouse()
  {
    return farmhouse;
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


public ArrayList<Vehicle> getVehicles()
{
  return this.vehicles;


}


public String getDayOfWeek()
{
  return this.dayOfWeek;
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

public ArrayList<Field> getfields()
{
  return this.fields;
}

public boolean removeFarmHouse()
{
  this.farmhouse = null;
  if(this.farmhouse == null)
  {
    return true;
  }
  else return false;
}

public boolean checkHorses(ArrayList<Stable> stables)
{
for(int i =0; i<stables.size();i++)
{
  for(int j=0;j<stables.get(i).size();j++)
  {

  }
}
}


public boolean removeCoop(int i)
{
  int current =this.coops.size();
  this.coops.remove(coops.get(i));
  int after = this.coops.size();
  if(after<current)
  {
    return true;
  }
  else return false;
}


public boolean removeStable(int i)
{
  int current =this.stables.size();
  this.stables.remove(stables.get(i));
  int after = this.stables.size();
  if(after<current)
  {
    return true;
  }
  else return false;
}

public void SetDayOfWeek(String week)
{
  this.dayOfWeek = week;
}


public boolean addFields(Field field)
{
  int current = this.fields.size();
  this.fields.add(field);
  int after = this.fields.size();
  if(after>current)
  {
    return true;
  }
  return false;
}


}

