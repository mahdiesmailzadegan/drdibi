package Model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class Order {

    //Variables

    @Id
    private Long id;
    private String total;
    private String dateTime;


    //Relations

    private ToOne<User> user;

    private ToMany<Product> products;

    //Constructors

    public Order() {
    }


    //Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public ToOne<User> getUser() {
        return user;
    }

    public void setUser(ToOne<User> user) {
        this.user = user;
    }

    public ToMany<Product> getProducts() {
        return products;
    }

    public void setProducts(ToMany<Product> products) {
        this.products = products;
    }


    //Methods


}
