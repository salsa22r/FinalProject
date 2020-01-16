package com.example.finalproject;

public class User {

    public String name, bio, venmoID, email;
    public int contact;

    public User(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getVenmoID() {
        return venmoID;
    }

    public void setVenmoID(String venmoID) {
        this.venmoID = venmoID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
}
