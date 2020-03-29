package Model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Address {
    @Id
    long id;
    ToOne<Province> province;
    ToOne<City> city;
    int postalCode;


}
