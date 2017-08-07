package com.example.admin.webviewsandsqllite;

/**
 * Created by Admin on 8/7/2017.
 */

public class MyContact {
    String name;
    String number;

    public MyContact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
