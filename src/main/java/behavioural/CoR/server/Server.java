package behavioural.CoR.server;

import behavioural.CoR.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Антон Дементьев on 17.02.2018.
 */
public class Server {
    private static Map<String,String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public static boolean hasEmail(String email) {
        return users.containsKey(email);
    }


}
