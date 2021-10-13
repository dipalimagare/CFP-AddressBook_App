package com.bridhelabz.addressBookApp.dto;

import lombok.*;

@Data
public class AddressBookDTO {
    private String name;
    private int mobileNo;
    private String state;
    private String city;
    private String email;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
