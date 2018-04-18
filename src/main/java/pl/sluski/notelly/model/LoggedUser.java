package pl.sluski.notelly.model;

import pl.sluski.notelly.entity.TUser;

/**
 *
 * @author Sluski
 */
public class LoggedUser {
    private static TUser user;

    public static TUser getUser() {
        return user;
    }

    public static void setUser(TUser user) {
        LoggedUser.user = user;
    }
}
