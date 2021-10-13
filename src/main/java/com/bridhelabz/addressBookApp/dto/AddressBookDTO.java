package com.bridhelabz.addressBookApp.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {

    private String name;
    private String mobileNo;
    private String state;
    private String city;
    private String email;
    private String address;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
