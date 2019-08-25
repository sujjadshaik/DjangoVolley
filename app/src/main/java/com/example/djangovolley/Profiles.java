package com.example.djangovolley;

public class Profiles {
    int id;
    String email;
    String name;


    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }



    public Profiles(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;

    }
}
