import java.util.ArrayList;


    public abstract class Storage<T> {
        ArrayList<T> storage;


        public void addT(T t) {
            storage.add(t);
        }


        public ArrayList<T> getStorage() {
            return storage;
        }

        public T get(int index) {
            return storage.get(index);

        }
    }