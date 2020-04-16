package Model;


import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Food {

    @Id
    private Long id;
    private String name;
    private int value;
    private double carbFactor;
    private double proteinFactor;
    private double fatFactor;

    private int glycaemicIndex;
    private int glycaemicLoad;


    private ToOne<Action> action;


}
