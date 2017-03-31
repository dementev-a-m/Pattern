package structural.adapter;

/**
 * Created by adementev on 01.04.2017.
 */
public class AdapterJavaToDatabase extends JavaApplication implements DataBase {
    @Override
    public void insert() {
        seveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void delete() {
        removeObject();
    }
}
