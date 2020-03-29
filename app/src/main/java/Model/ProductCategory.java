package Model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public class ProductCategory {

    @Id
    long id;
    String name;
    ToMany<ProductSubCategory> subCategories;
    ToMany<Product> products;

}
