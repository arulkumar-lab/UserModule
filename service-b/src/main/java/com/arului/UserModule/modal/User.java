package com.arului.UserModule.modal;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String dob;
    private String location;
    private String country;

    public String getId () {
        return id;
    }

    public void setId ( String id ) {
        this.id = id;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public String getDob () {
        return dob;
    }

    public void setDob ( String dob ) {
        this.dob = dob;
    }

    public String getLocation () {
        return location;
    }

    public void setLocation ( String location ) {
        this.location = location;
    }

    public String getCountry () {
        return country;
    }

    public void setCountry ( String country ) {
        this.country = country;
    }
}
