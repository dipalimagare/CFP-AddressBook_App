package com.bridhelabz.addressBookApp.service;

import com.bridhelabz.addressBookApp.dto.*;

import java.util.*;

public interface IAddressBookService {
    List<AddressBookDTO> getAddresses();

    AddressBookDTO addAddressBook(AddressBookDTO addressBookDTO);

    AddressBookDTO updateAddressBook(int id, AddressBookDTO addressBookDTO);
}