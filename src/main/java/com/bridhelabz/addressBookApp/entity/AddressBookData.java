package com.bridhelabz.addressBookApp.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class AddressBookData {
    @Id
    private int id;
    private String name;
    private int mobileNo;
    private String state;
    private String city;
    private String email;
}
