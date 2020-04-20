package Model;


import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;


@Entity
public class Action {

    //Variables

    @Id
    private Long id;
    private String sugarValue;
    private String dateTime;

    //Relations

    @Backlink(to = "actions")
    private ToMany<Food> foods;


    private ToOne<Insulin> insulin;

    private ToOne<User> user;

    //Constructors

    public Action() {
    }


    //Getters & Setters


    public ToOne<User> getUser() {
        return user;
    }

    public void setUser(ToOne<User> user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSugarValue() {
        return sugarValue;
    }

    public void setSugarValue(String sugarValue) {
        this.sugarValue = sugarValue;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public ToMany<Food> getFoods() {
        return foods;
    }

    public void setFoods(ToMany<Food> foods) {
        this.foods = foods;
    }

    public ToOne<Insulin> getInsulin() {
        return insulin;
    }

    public void setInsulin(ToOne<Insulin> insulin) {
        this.insulin = insulin;
    }


    //Methods


}
