package pl.sluski.notelly.model;

import pl.sluski.notelly.dao.UserDao;
import pl.sluski.notelly.entity.TUser;

/**
 *
 * @author Sluski
 */
public class UserManager {

    private final UserDao dao;

    public UserManager() {
        dao = new UserDao();
    }

    public boolean login(String login, String password) {
        TUser user;
            if (login.contains("@")) {
                user = dao.findSingleUserByEmail(login);
            } else {
                user = dao.findSingleUserByNick(login);
            }
            if(user.getPassword().equals(password)){
                LoggedUser.setUser(user);
                return true;
            }else{
                return false;
            }
    }
}
