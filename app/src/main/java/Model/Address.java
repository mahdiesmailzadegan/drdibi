package Model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class Address {

    //Variables

    @Id
    private Long id;
    private String postalCode;
    private String restOfAddress;

    //Relations

    private ToOne<User> user;
    private ToOne<Province> province;
    private ToOne<City> city;

    //Constructors

    public Address() {
    }

    //Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ToOne<Province> getProvince() {
        return province;
    }

    public void setProvince(ToOne<Province> province) {
        this.province = province;
    }

    public ToOne<City> getCity() {
        return city;
    }

    public void setCity(ToOne<City> city) {
        this.city = city;
    }

    public ToOne<User> getUser() {
        return user;
    }

    public void setUser(ToOne<User> user) {
        this.user = user;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRestOfAddress() {
        return restOfAddress;
    }

    public void setRestOfAddress(String restOfAddress) {
        this.restOfAddress = restOfAddress;
    }

    //Methods
}
