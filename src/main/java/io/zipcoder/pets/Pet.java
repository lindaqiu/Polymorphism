package io.zipcoder.pets;

public abstract class Pet {

    private String name;
    private String speech;

    public Pet(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public abstract String speak();

}
