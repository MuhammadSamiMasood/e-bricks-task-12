package JSONPractice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class PersonDeserializer {

    @JsonIgnore
    public int CNIC;

    @JsonIgnore
    public String rollNumber;

    @JsonIgnore
    public String Gender;

    public long id = 0;
    public String name = null;

    @JsonDeserialize(using = OptimizedBooleanDeserializer.class)
    public String test = "Starting";
}
