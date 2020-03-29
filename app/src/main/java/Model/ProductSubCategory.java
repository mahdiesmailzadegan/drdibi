package Model;

import java.util.List;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

@Entity
public class ProductSubCategory {
    @Id
    long id;
    String name;
    ToOne<Product> productList;
    ToOne<Product> products;
}
