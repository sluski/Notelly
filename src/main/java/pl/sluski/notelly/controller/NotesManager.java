package pl.sluski.notelly.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pl.sluski.notelly.model.LoggedUser;

/**
 *
 * @author Sluski
 */
@ManagedBean
@SessionScoped
public class NotesManager {
    
    public String getHello() {
        return "Hello " + LoggedUser.getUser().getNick();
    }
    
    public void addNote(){
        
    }
}
