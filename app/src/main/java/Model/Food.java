package Model;


import androidx.annotation.NonNull;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public class Food {

    //Variables

    @Id
    private Long id;
    private String name;
    private int value;
    private double carbFactor;
    private double proteinFactor;
    private double fatFactor;
    private int glycaemicIndex;
    private int glycaemicLoad;

    //Relations

    private ToMany<Action> actions;

    //Constructors

    public Food() {
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getCarbFactor() {
        return carbFactor;
    }

    public void setCarbFactor(double carbFactor) {
        this.carbFactor = carbFactor;
    }

    public double getProteinFactor() {
        return proteinFactor;
    }

    public void setProteinFactor(double proteinFactor) {
        this.proteinFactor = proteinFactor;
    }

    public double getFatFactor() {
        return fatFactor;
    }

    public void setFatFactor(double fatFactor) {
        this.fatFactor = fatFactor;
    }

    public int getGlycaemicIndex() {
        return glycaemicIndex;
    }

    public void setGlycaemicIndex(int glycaemicIndex) {
        this.glycaemicIndex = glycaemicIndex;
    }

    public int getGlycaemicLoad() {
        return glycaemicLoad;
    }

    public void setGlycaemicLoad(int glycaemicLoad) {
        this.glycaemicLoad = glycaemicLoad;
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
