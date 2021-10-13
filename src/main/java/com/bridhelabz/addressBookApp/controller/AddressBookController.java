package com.bridhelabz.addressBookApp.controller;

import com.bridhelabz.addressBookApp.dto.*;
import com.bridhelabz.addressBookApp.entity.*;
import com.bridhelabz.addressBookApp.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@RestController
@RequestMapping("/Api")
public class AddressBookController {
// CRUD
    //read
    //creating
    //updating
    //deleting

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping(value = "/person")
    public List<AddressBookData> person(){
        return addressBookService.addressBookDataList();
    }

    @GetMapping(value = "/get-person-by-id")
    public AddressBookData getPersonById(@RequestParam int id){
        return addressBookService.getPersonById(id);
    }

    @GetMapping(value = "/get-person-by-Name")
    public AddressBookData getPersonByName(@RequestParam String name) {
        return addressBookService.getPersonByName(name);
    }

    @GetMapping(value = "/get-person-by-mobile")
    public AddressBookData getPersonByMobileNo(@RequestParam String mobileNo){
        return addressBookService.getPersonByMobileNo(mobileNo);
    }

    @GetMapping(value = "/get-person-by-State")
    public AddressBookData getPersonByState(@RequestParam String state) {
        return addressBookService.getPersonByState(state);
    }

    @GetMapping(value = "/get-person-by-City")
    public AddressBookData getPersonByCity(@RequestParam String city) {
        return addressBookService.getPersonByCity(city);
    }

    @GetMapping(value = "/get-person-by-Email")
    public AddressBookData getPersonByEmail(@RequestParam String email) {
        return addressBookService.getPersonByEmail(email);
    }

    @PostMapping(value = "/person-get")
    public AddressBookData addPerson(@RequestBody AddressBookData addressBookData) {
        return addressBookService.addPerson(addressBookData);
    }

    @PutMapping(value = "/person")
    public AddressBookData updatePerson(@PathVariable int id, @RequestBody AddressBookDTO addressBookDTO) {
        return addressBookService.updatePerson(id, addressBookDTO);
    }

    @DeleteMapping(value = "/person-delete")
    public String deletePerson(@RequestParam int id) {
        return addressBookService.deletePerson(id);
    }
}
