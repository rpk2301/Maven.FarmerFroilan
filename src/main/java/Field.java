import java.util.ArrayList;

public class Field {

    ArrayList<CropRow> field = new ArrayList<CropRow>();

    public ArrayList<CropRow> getField() {
        return field;
    }

    public void setField(ArrayList<CropRow> field) {
        this.field = field;
    }

    public CropRow getField(int index) {
        if (index >= 0 && index < field.size()) {
            return field.get(index);
        }
        return null;

    }

    ;
}