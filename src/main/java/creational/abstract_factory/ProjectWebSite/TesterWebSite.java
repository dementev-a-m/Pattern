package creational.abstract_factory.ProjectWebSite;

import creational.abstract_factory.Tester;

/**
 * Created by adementev on 31.03.2017.
 */
public class TesterWebSite implements Tester {
    @Override
    public void testing() {
        System.out.println("Создан тестировщик сайта");
    }
}
