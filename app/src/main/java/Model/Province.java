package Model;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public class Province {

    //Variables

    @Id
    private long id;
    private String name;

    //Relations

    @Backlink(to = "province")
    private ToMany<City> cities;

    @Backlink(to = "province")
    private ToMany<Address> addresses;

    //Constructors

    public Province() {
    }

    public Province(String name) {
        this.name = name;
    }

    //Getters & Setters

    public ToMany<City> getCities() {
        return cities;
    }

    public void setCities(ToMany<City> cities) {
        this.cities = cities;
    }

    public ToMany<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ToMany<Address> addresses) {
        this.addresses = addresses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods

}
