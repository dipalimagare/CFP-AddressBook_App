package com.bridhelabz.addressBookApp.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String mobileNo;
    private String state;
    private String city;
    private String email;

    public void setAddress(String state) {
        this.state = state;
    }
}
