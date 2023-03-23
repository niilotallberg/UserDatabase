package com.example.userdatabase;

import android.widget.RadioGroup;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    private int image;

    public static int userCounter = 0;

    public User(String firstName, String lastName, String email, String degreeProgram, int image) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.email = email;
         this.degreeProgram = degreeProgram;
         this.image = image;

         userCounter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getImage() {
        return image;
    }
}
