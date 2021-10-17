package com.bridhelabz.addressBookApp.builder;

import com.bridhelabz.addressBookApp.dto.*;
import com.bridhelabz.addressBookApp.entity.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for the business logic for AddressBook App Builder service
 *
 * @author Dipali Magare
 * @version 0.0.1
 * @since 16-10-2021
 */

@ExtendWith(MockitoExtension.class)
class AddressBuilderTest {

    @InjectMocks
    private AddressBuilder addressBuilder;

    @Test
    public void buildDOTest() {
        AddressBookDTO addressBookDTO = new AddressBookDTO();
        addressBookDTO.setName("Dipali");
        addressBookDTO.setState("MH");
        AddressBookData addressBookDO = addressBuilder.buildDO(addressBookDTO);
        Assertions.assertEquals("Dipali", addressBookDO.getName());
        Assertions.assertEquals("MH", addressBookDO.getState());
    }
}