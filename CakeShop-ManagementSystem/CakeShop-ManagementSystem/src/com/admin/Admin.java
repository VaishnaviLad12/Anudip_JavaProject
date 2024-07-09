package com.admin;

public class Admin {
    private int id;
    private String username;
    private String password;

    public Admin(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public void setUsername(String username) {
    	this.username=username;
    }
    
    public String getUsername() {
    	return username;
    }
    
    public void setPassword(String password) {
    	this.password=password;
    }
    
    public String getPassword() {
    	return password;
    }
    public void setId( int id) {
    	this.id=id;
    }
    
    public int getId() {
    	return id;
    }
}

