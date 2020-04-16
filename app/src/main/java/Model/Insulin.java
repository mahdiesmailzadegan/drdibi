package Model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Insulin {

    @Id
    private Long id;
    private String name;
    private String type;
    private String value;
    private String onSet;
    private String peak;
    private String duratin;


    private ToOne<Action> action;


}
