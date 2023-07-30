import java.util.ArrayList;

public abstract class  Storage<T> {

    private ArrayList<T> storage;


    public ArrayList<T> getStoraage() {
        return storage;
    }

    public void add(T something)
    {
        storage.add(something);
    }

    public T get(int index)
    {
        return storage.get(index);
    }


}
