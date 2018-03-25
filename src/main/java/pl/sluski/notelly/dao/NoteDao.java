package pl.sluski.notelly.dao;

import java.util.List;
import pl.sluski.notelly.entity.TNote;
import pl.sluski.notelly.entity.TUser;

/**
 *
 * @author Sluski
 */
public class NoteDao {
    private final Dao dao;
    
    public NoteDao(){
        dao = new Dao();
    }
    
    public void add(TNote note){
        dao.add(note);
    }
    
    public List<TNote> takeAllNotes(){
        return null;
    }
    
    public void removeAllNotes(){
    }
    
    public void removeSingleNote(TNote note){
        
    }
    
    public void updateSingleObject(){
    
    }
}
