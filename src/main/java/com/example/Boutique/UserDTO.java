package com.example.Boutique;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDTO {

    @NotEmpty(message = "username ne peut être vide.")
    @Size(min = 5, max = 250)
    private String userName;
    @NotEmpty(message = "firstName ne peut être vide.")
    private String firstName;
    @NotEmpty(message = "lastName ne peut être vide.")
    private String lastName;
    @NotEmpty(message = "password ne peut être vide.")
    private String password;
    @NotEmpty(message = "email ne peut être vide.")
    private String email;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserDTO [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
                + password + ", email=" + email + "]";
    }
}