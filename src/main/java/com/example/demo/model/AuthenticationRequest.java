package com.example.demo.model;

/**
 * Input argument for the authentication API endpoint.
 */

public class AuthenticationRequest {
    private String userName;
    private String password;

    //DEFAULT-C
    public AuthenticationRequest() {

    }
    //OVERLOADED-C
    public AuthenticationRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
