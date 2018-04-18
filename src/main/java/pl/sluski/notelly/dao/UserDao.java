package pl.sluski.notelly.dao;

import java.util.List;
import pl.sluski.notelly.entity.TUser;

/**
 *
 * @author Sluski
 */
public class UserDao extends Dao<TUser> {

    //C
    @Override
    public void add(TUser objectToAdd) {
        super.add(objectToAdd);
    }

    //R
    public TUser findSingleUserByNick(String nick) {
        return (TUser) super.findSingleObject(new TUser().getTableName(), "nick", nick);
    }

    public TUser findSingleUserByEmail(String email) {
        return (TUser) super.findSingleObject(new TUser().getTableName(), "email", email);
    }

    public List<TUser> takeAll() {
        return super.findAllObjects(new TUser().getTableName());
    }

    //U
    public void updateEmail(String newEmail, String userNick) {
        super.updateSingleObject(new TUser().getTableName(), "email", newEmail, userNick);
    }

    //D
    public void removeAll() {
        super.removeAllObjects(new TUser().getTableName());
    }

    public void remove(TUser user) {
        super.removeSingleObject(user);
    }
}
