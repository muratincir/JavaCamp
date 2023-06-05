package Entities;

import Abstract.Entity;

public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirty;
    private String nationalId;


    public Customer(int id, String firstName, String lastName, String dateOfBirty, String nationalId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirty = dateOfBirty;
        this.nationalId = nationalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirty() {
        return dateOfBirty;
    }

    public void setDateOfBirty(String dateOfBirty) {
        this.dateOfBirty = dateOfBirty;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
