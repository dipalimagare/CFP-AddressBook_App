package com.bridhelabz.addressBookApp.repository;

import com.bridhelabz.addressBookApp.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {

    Optional<AddressBookData> findByName(String name);

    Optional<AddressBookData> findByMobileNo(int mobileNo);

    Optional<AddressBookData> findByState(String state);

    Optional<AddressBookData> findByCity(String city);

    Optional<AddressBookData> findByEmail(String email);

}
