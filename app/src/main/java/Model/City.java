package Model;


import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class City {

    //Variables

    @Id
    private long id;
    private String name;

    //Relations

    @Backlink(to = "city")
    private ToMany<Address> addresses;

    private ToOne<Province> province;

    //Constructors


    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    //Getters & Setters

    public ToMany<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ToMany<Address> addresses) {
        this.addresses = addresses;
    }

    public ToOne<Province> getProvince() {
        return province;
    }

    public void setProvince(ToOne<Province> province) {
        this.province = province;
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
