package Model;

import androidx.annotation.NonNull;

import java.time.LocalTime;

import io.objectbox.annotation.Backlink;
import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.annotation.Unique;
import io.objectbox.relation.ToMany;

@Entity
public class User {

    @Id
    private long id;
    private String name;
    private String FName;
    private String age;
    private boolean isMale;
    private int weight;
    private String height;
    @Unique
    private String mobile;
    @Backlink(to = "user")
    private ToMany<Address> addresses;
    @Backlink(to = "users")
    private ToMany<Food> foods;
    private double carbFactor;
    private double maxCarbFactor;
    private double minCarbFactor;
    @Backlink(to = "user")
    private ToMany<Action> actions;

    public User() {
    }

    public User(String age, boolean isMale, int weight, String height, String mobile) {
        this.age = age;
        this.isMale = isMale;
        this.weight = weight;
        this.height = height;
        this.mobile = mobile;
    }

    public double getMaxCarbFactor() {
        return maxCarbFactor;
    }

    public void setMaxCarbFactor(double maxCarbFactor) {
        this.maxCarbFactor = maxCarbFactor;
    }

    public double getMinCarbFactor() {
        return minCarbFactor;
    }

    public void setMinCarbFactor(double minCarbFactor) {
        this.minCarbFactor = minCarbFactor;
    }

    public ToMany<Food> getFoods() {
        return foods;
    }

    public void setFoods(ToMany<Food> foods) {
        this.foods = foods;
    }

    public ToMany<Action> getActions() {
        return actions;
    }

    public void setActions(ToMany<Action> actions) {
        this.actions = actions;
    }

    public double getCarbFactor() {

        if (weight < 27) {
            maxCarbFactor = 30;
            minCarbFactor = 15;
            checkHour();


        } else if (weight < 36) {
            maxCarbFactor = 25;
            minCarbFactor = 12.5;
            checkHour();


        } else if (weight < 45) {
            maxCarbFactor = 20;
            minCarbFactor = 10;
            checkHour();

        } else if (weight < 54) {
            maxCarbFactor = 18;
            minCarbFactor = 9;
            checkHour();

        } else if (weight < 63) {
            maxCarbFactor = 15;
            minCarbFactor = 7.5;
            checkHour();

        } else if (weight < 76) {
            maxCarbFactor = 12;
            minCarbFactor = 6;
            checkHour();

        } else if (weight < 90) {
            maxCarbFactor = 10;
            minCarbFactor = 5;
            checkHour();

        } else if (weight < 103) {
            maxCarbFactor = 8;
            minCarbFactor = 4;
            checkHour();

        } else if (weight < 122) {
            maxCarbFactor = 6;
            minCarbFactor = 3;
            checkHour();

        } else {
            maxCarbFactor = 5;
            minCarbFactor = 2.5;
            checkHour();

        }


        return carbFactor;
    }

    public void setCarbFactor(double carbFactor) {
        this.carbFactor = carbFactor;
    }

    private void checkHour() {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour > 3 && hour < 11) {
            carbFactor = minCarbFactor;


        } else if (hour > 11 && hour < 19) {
            carbFactor = (maxCarbFactor + minCarbFactor) / 2;

        } else {
            carbFactor = maxCarbFactor;

        }
    }

    public ToMany<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ToMany<Address> addresses) {
        this.addresses = addresses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @NonNull
    @Override
    public String toString() {

        return getMobile();
    }
}
