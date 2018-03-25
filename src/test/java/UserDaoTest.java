
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.sluski.notelly.dao.Dao;
import pl.sluski.notelly.dao.UserDao;
import pl.sluski.notelly.entity.TUser;

/**
 *
 * @author Sluski
 */
public class UserDaoTest {

    private final UserDao userDao;
    private final Dao<TUser> dao;
    private TUser user;

    public UserDaoTest() {
        userDao = new UserDao();
        dao = new Dao<>();
        
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        user = new TUser();
        user.setNick("sluski");
        user.setEmail("example@test.com");
    }

    @After
    public void tearDown() {
//       removeAll_tryRemoveAllUsers_tableUserSizeEqualZero();

    }
    

    @Test
    public void add_addCorrectUser_addedToDB() {
        userDao.add(user);
        assertTrue("DB should have one row, user is not added", userDao.takeAll().size() > 0);

    }

//    @Test
//    public void removeAll_tryRemoveAllUsers_tableUserSizeEqualZero() {
//        if(userDao.takeAll().isEmpty()) userDao.add(user);
//        userDao.removeAll();
//        assertTrue("All users should be deleted, one or more objects are still in table", userDao.takeAll().isEmpty());
//    }
//
//    @Test
//    public void takeSingleUserByNick_findUser_singleUser() {
//        userDao.add(user);
//        TUser selectedUser = (TUser) userDao.findSingleUserByNick("sluski");
//        if (selectedUser != null) {
//            assertTrue("Selected user is not equal to wanted", selectedUser.equals(user));
//        } else {
//            assertTrue("Selected user is not in table but he should be", false);
//        }
//    }
//    
//    @Test
//    public void takeSingleUserByEmail_user_singleUser() {
//        userDao.add(user);
//        TUser selectedUser = (TUser) userDao.findSingleUserByEmail("example@test.com");
//        if (selectedUser != null) {
//            assertTrue("Selected user is not equal to wanted", selectedUser.equals(user));
//        } else {
//            assertTrue("Selected user is not in table but he should be", false);
//        }
//    }
//    
//    @Test
//    public void updateEmail_changeEmail_emailChanged(){
//        userDao.add(user);
//        userDao.updateEmail("changed@email.com", user.getNick());
//        assertTrue("Email not changed", userDao.findSingleUserByNick("sluski").getEmail().equals("changed@email.com"));
//    }
    
}
