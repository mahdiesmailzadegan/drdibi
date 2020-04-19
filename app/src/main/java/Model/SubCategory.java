package Model;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;

@Entity
public class SubCategory {

    //Variables

    @Id
    private Long id;

    //Relations

    private ToOne<Category> category;

    @Backlink(to = "subcategory")
    private ToMany<Product> products;

    //Constructors

    public SubCategory() {
    }


    //Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ToOne<Category> getCategory() {
        return category;
    }

    public void setCategory(ToOne<Category> category) {
        this.category = category;
    }

    public ToMany<Product> getProducts() {
        return products;
    }

    public void setProducts(ToMany<Product> products) {
        this.products = products;
    }


    //Methods


}
