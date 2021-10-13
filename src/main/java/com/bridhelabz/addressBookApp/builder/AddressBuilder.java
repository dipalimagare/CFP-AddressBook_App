package com.bridhelabz.addressBookApp.builder;

import com.bridhelabz.addressBookApp.dto.*;
import com.bridhelabz.addressBookApp.entity.*;
import org.springframework.beans.*;
import org.springframework.stereotype.*;

/**
 * AddressBuilder builds the AddressBookData Entity Configuration with HTTP request response in application
 * @author Dipali Magare
 * version 0.0.1
 * @since 16-10-2021
 */

@Component
public class AddressBuilder {
    public AddressBookData buildDO(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookDO = new AddressBookData();
        BeanUtils.copyProperties(addressBookDTO, addressBookDO);
        return addressBookDO;
    }
}
