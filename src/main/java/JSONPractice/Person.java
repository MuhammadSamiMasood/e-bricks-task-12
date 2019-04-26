package JSONPractice;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Person {
    private long personId = 0;
    private String name = null;
    private int personCNIC = 0;
    private String r = "r";
    private String g = "g";

    public String getR() {
        return r;
    }

    public String getG() {
        return g;
    }

    @JsonAnySetter
    public void set(String s, Object o) {
        if (s == "rollNumber") {
            r = (String)o;
        } else {
            g = (String)o;
        }
    }

    public int getPersonCNIC() {
        return personCNIC;
    }

    @JsonSetter("CNIC")
    public void setPersonCNIC(int personCNIC) {
        this.personCNIC = personCNIC;
    }

    public long getPersonId() {
        return this.personId;
    }

    @JsonSetter("id")
    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
