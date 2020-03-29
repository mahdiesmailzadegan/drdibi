package Model;


import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class City {

    @Id
    long id;
    String name;
    ToMany<User> users;
    ToOne<Province> province;
    ToMany<Address> addresses;


}
