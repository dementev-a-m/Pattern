package structural.adapter;

/**
 * Created by adementev on 01.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDatabase();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.delete();
    }
}
