package Model;

import java.util.List;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class User {

    @Id
    long id;
    String name;
    int age;
    boolean insulinUser;
    String fName;
    int weight;
    enum gender {MALE, FEMALE}    ;
    ToOne<City> city;
    ToOne<Province> province;
    ToMany<Product> products;
    ToMany<Address> addresses;
    ToMany<Food> foods;

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isInsulinUser() {
        return insulinUser;
    }

    public void setInsulinUser(boolean insulinUser) {
        this.insulinUser = insulinUser;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ToOne<City> getCity() {
        return city;
    }

    public void setCity(ToOne<City> city) {
        this.city = city;
    }

    public ToOne<Province> getProvince() {
        return province;
    }

    public void setProvince(ToOne<Province> province) {
        this.province = province;
    }

    public ToMany<Product> getProducts() {
        return products;
    }

    public void setProducts(ToMany<Product> products) {
        this.products = products;
    }

    public ToMany<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ToMany<Address> addresses) {
        this.addresses = addresses;
    }

    public ToMany<Food> getFoods() {
        return foods;
    }

    public void setFoods(ToMany<Food> foods) {
        this.foods = foods;
    }
}
