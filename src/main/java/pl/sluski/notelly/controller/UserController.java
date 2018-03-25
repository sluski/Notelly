package pl.sluski.notelly.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.sluski.notelly.UserServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.sluski.notelly.entity.TUser;


/**
 *
 * @author Sluski
 */
@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private final UserServices services;
    
    public UserController(){
        services = new UserServices();
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<TUser> getAll(){
        return services.getAllUsers();
    }
    
}
