package com.example.garrett.updatedtestgameplan;

public class User {
    int id;
    String username, email, password;


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
}
