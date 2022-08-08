package com.bify.bify;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String password;

    public void setId(Integer Id){
        this.id=Id;
    }

    public Integer getId(){
        return id;
    }

    public void setFirstName(Integer Id){
        this.id=Id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPassword(String password){
        this.password=password;
    } 
    
    public String getPassword(){
        return password;
    }
    
}
