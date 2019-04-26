package JSONPractice;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonImmutable {

    @JsonIgnore
    public int CNIC;

    @JsonIgnore
    public String rollNumber;

    @JsonIgnore
    public String Gender;

    @JsonIgnore
    public String test;

    private int id;
    private String name;

    @JsonCreator
    public PersonImmutable(@JsonProperty("id") int id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
