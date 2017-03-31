package creational.builder;

/**
 * Created by adementev on 31.03.2017.
 */
public class Program {
    private String name;
    private Server server;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Program {"+name+" "+server+" "+price+"}";
    }
}
