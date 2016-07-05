package com.github.abdalimran.simplelistview;

public class Profile {
    private String name;
    private String description;
    private int propic;

    public Profile(String name,String description,int propic)
    {
        this.name=name;
        this.description=description;
        this.propic=propic;
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

    public int getPropic() {
        return propic;
    }

    public void setPropic(int propic) {
        this.propic = propic;
    }
}
