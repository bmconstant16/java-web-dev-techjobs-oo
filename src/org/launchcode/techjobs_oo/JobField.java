package org.launchcode.techjobs_oo;

//abstract class prevents creation of a jobfield object

import java.util.Objects;

public abstract class JobField {

//      Location, Employer, Core Competency, and Position Type all have these things in common;
    //properties
    private int id;
    private static int nextId = 1;
    private String value;

    //similar constructors- empty constructor

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    //similar constructors- adding the value and ID
    public JobField(String value) {
        this();
        this.value = value;
    }

    //similar getters/setters (all three are similar)

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //similar custom methods
    //Custom toString, equals, and hashCode methods?

    // Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency coreCompetency = (CoreCompetency) o;
        return getId() == coreCompetency.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
