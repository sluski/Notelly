package pl.sluski.notelly.dao;

import java.util.List;
import pl.sluski.notelly.entity.TNote;

/**
 *
 * @author Sluski
 */
public class NoteDao extends Dao<TNote>{
    
    public NoteDao(){

    }
    
    @Override
    public void add(TNote note){
        super.add(note);
    }
    
    public List<TNote> takeAllNotes(){
        return super.findAllObjects(new TNote().getTableName());
    }
    
    public void removeAllNotes(){
    }
    
    public void removeSingleNote(TNote note){
        
    }
    
    public void updateSingleObject(){
    
    }
}
