package Model;

import androidx.annotation.NonNull;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class Product {

    //Variables

    @Id
    private Long id;
    private String name;
    private int number;
    private String price;

    //Relations

    private ToOne<SubCategory> subCategory;

    @Backlink(to = "products")
    private ToMany<Order> orders;

    //Constructors

    public Product() {
    }


    //Getters & Setters


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ToMany<Order> getOrders() {
        return orders;
    }

    public void setOrders(ToMany<Order> orders) {
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ToOne<SubCategory> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(ToOne<SubCategory> subCategory) {
        this.subCategory = subCategory;
    }


    //Methods


    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
