package Model;

import io.objectbox.annotation.Id;

public class Insulin {
    @Id
    long id;
    String name;

    float onSet;
    float peak;
    float duration;
}
