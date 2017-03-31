package creational.factory;

/**
 * Created by adementev on 31.03.2017.
 */
public class CSharpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer created() {
        return new CSharpDeveloper();
    }
}
