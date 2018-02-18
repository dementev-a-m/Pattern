package behavioural.CoR.middleware;


import behavioural.CoR.server.Server;

/**
 * Created by Антон Дементьев on 17.02.2018.
 */
public class UserExistsMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (!Server.hasEmail(email))
            return false;

        return checkNext(email, password);
    }
}
