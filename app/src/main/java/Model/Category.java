package Model;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public class Category {

    //Variables

    @Id
    private Long id;

    //Relations

    @Backlink(to = "category")
    private ToMany<SubCategory> subCategories;

    //Constructors

    public Category() {
    }


    //Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ToMany<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(ToMany<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }


    //Methods

}

