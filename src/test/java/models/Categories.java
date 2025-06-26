package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Categories {


    private String name;
    private String  description;


    public Categories(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Categories() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
