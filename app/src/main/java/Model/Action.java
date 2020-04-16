package Model;


import java.util.Calendar;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;


@Entity
public class Action {
    @Id
    private Long id;
    private String sugarValue;
    private String dateTime;
    private ToMany<Food> foods;
    private ToOne<Insulin> insulin;

    public Action() {
        Calendar calendar = Calendar.getInstance();

    }


}
