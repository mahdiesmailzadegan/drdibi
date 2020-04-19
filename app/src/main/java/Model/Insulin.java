package Model;

import androidx.annotation.NonNull;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public class Insulin {

    //Variables

    @Id
    private Long id;
    private String name;
    private String type;
    private String value;
    private String onSet;
    private String peak;
    private String duratin;

    //Relations

    private ToMany<Action> actions;

    //Constructors

    public Insulin() {
    }


    //Getters & Setters

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOnSet() {
        return onSet;
    }

    public void setOnSet(String onSet) {
        this.onSet = onSet;
    }

    public String getPeak() {
        return peak;
    }

    public void setPeak(String peak) {
        this.peak = peak;
    }

    public String getDuratin() {
        return duratin;
    }

    public void setDuratin(String duratin) {
        this.duratin = duratin;
    }

    public ToMany<Action> getActions() {
        return actions;
    }

    public void setActions(ToMany<Action> actions) {
        this.actions = actions;
    }


    //Methods


    @NonNull
    @Override
    public String toString() {
        return name;
    }
}
