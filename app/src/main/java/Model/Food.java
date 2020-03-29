package Model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
@Entity
public class Food {
    @Id
    long id;
    String name;
    float fat;
    float protein;
    float carb;
    ToMany<User> users;

}
