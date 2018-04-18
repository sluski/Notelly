package pl.sluski.notelly.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.NoResultException;

import pl.sluski.notelly.model.UserManager;

/**
 *
 * @author Sluski
 */

@ManagedBean
@SessionScoped
public class Login {
    private final UserManager manager;
    private String userLogin;
    private String password;
    private String message;
    
    public Login(){
        manager = new UserManager();
        message = "";
    }
    
    public String login(){
        try{
            if(!userLogin.equals("") && !password.equals("")) {
                boolean logged = manager.login(userLogin, password);
                if(logged) return "notesManager.xhtml?faces-redirect=true";
                else error();

            }else fillDataError();
        }catch(NoResultException ex){
            error();
        }
        return "";
    }

    private void error() {
        message = "Incorrect login or password!";
    }
    
    private void fillDataError(){
        message = "Login or password field is empty";
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String login) {
        this.userLogin = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
