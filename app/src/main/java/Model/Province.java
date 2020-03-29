package Model;

import java.util.List;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public class Province {

    @Id long id;
    String name;
    ToMany<City> cities;

    ToMany<Address> addresses;



}
