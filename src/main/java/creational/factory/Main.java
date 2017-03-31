package creational.factory;

/**
 * Created by adementev on 31.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory =createDeveloperFactory("C#");
        Developer developer=developerFactory.created();
        developer.writeCode();
    }
    public static DeveloperFactory createDeveloperFactory(String dev){
        switch (dev) {
            case "Java":
                return new JavaDeveloperFactory();
            case "C#":
                return new CSharpDeveloperFactory();
            default:
                System.out.println("Данного разработчика не существует");
                return null;
        }
    }
}
