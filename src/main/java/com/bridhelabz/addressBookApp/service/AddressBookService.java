package com.bridhelabz.addressBookApp.service;

import com.bridhelabz.addressBookApp.dto.*;
import com.bridhelabz.addressBookApp.entity.*;
import com.bridhelabz.addressBookApp.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * Class for the business logic for AddressBook App Controller service
 *
 * @author Dipali Magare
 * @version 0.0.1
 * @since 13-10-2021
 */

@Service
public class AddressBookService {

    @Autowired
    private static AddressBookRepository addressBookRepository;
//    @Autowired
//    private ModelMapper modelMapper;

    /**
     * Method for getting all the students from database
     * @return list of {@link AddressBookData Entity}
     */

    public static List<AddressBookData> addressBookDataList(){
        return addressBookRepository.findAll();
    }

    /**
     * Method for getting person by its id
     * @param id unique identifier for record
     * @return singular {@link AddressBookData Entity}
     */

    public AddressBookData getPersonById(int id){
        Optional<AddressBookData> addressBookData = addressBookRepository.findById(id);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByName(String name){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByName(name);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByMobileNo(int mobileNo){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByMobileNo(mobileNo);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByState(String state){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByState(state);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByCity(String city){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByCity(city);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    public AddressBookData getPersonByEmail(String email){
        Optional<AddressBookData> addressBookData = addressBookRepository.findByEmail(email);
        if (addressBookData.isPresent()){
            return addressBookData.get();
        }
        return null;
    }

    /**
     *
     * @param addressBookData
     * @return
     */

    public AddressBookData addPerson(AddressBookData addressBookData){
        return addressBookRepository.save(addressBookData);

    }

    public String deletePerson(int id){
        Optional<AddressBookData> addressBookData = addressBookRepository.findById(id);
        if(addressBookData.isPresent()){
            addressBookRepository.delete(addressBookData.get());
            return "Employee Record is deleted successfully.";
        }
        return "Record does not exists with this id : " + id;

    }

    public AddressBookData updatePerson( AddressBookData addressBookData){
        return addressBookRepository.save(addressBookData);
    }
}
