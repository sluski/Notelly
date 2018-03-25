package pl.sluski.notelly.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pl.sluski.notelly.entity.TUser;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T20:02:05")
@StaticMetamodel(TNote.class)
public class TNote_ { 

    public static volatile SingularAttribute<TNote, String> settings;
    public static volatile ListAttribute<TNote, TUser> availableFor;
    public static volatile SingularAttribute<TNote, Long> id;
    public static volatile SingularAttribute<TNote, TUser> author_id;
    public static volatile SingularAttribute<TNote, String> title;
    public static volatile SingularAttribute<TNote, String> content;
    public static volatile SingularAttribute<TNote, Date> createDate;
    public static volatile SingularAttribute<TNote, Date> timeOut;

}