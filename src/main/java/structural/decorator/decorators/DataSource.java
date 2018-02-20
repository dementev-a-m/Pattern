package structural.decorator.decorators;

/**
 * Created by adementev on 13.02.2018.
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
