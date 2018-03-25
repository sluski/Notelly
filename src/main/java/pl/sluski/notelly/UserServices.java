package pl.sluski.notelly;

import java.util.List;
import pl.sluski.notelly.entity.TUser;
import pl.sluski.notelly.dao.UserDao;
 

/**
 *
 * @author Sluski
 */

public class UserServices {
    private final UserDao userDao;
    
    public UserServices(){
        userDao = new UserDao();
    }
    
    public void addUser(TUser user) {
        userDao.add(user);
    }
    
    public void deleteUser(TUser user){
        userDao.remove(user);
    }
    
    public void updateUser(String newEmail, TUser user){
        userDao.updateEmail(newEmail, user.getNick());
    }
    
    public List<TUser> getAllUsers(){
        return userDao.takeAll();
        
    }
    
    public TUser getSingleUserByNick(String nick){
        return userDao.findSingleUserByNick(nick);
    }
    
    public TUser getSingleUserByEmail(String email){
        return userDao.findSingleUserByEmail(email);
    }
    
    
    
    
    
    
}
