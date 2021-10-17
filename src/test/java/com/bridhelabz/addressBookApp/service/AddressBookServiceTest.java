package com.bridhelabz.addressBookApp.service;

import com.bridhelabz.addressBookApp.builder.*;
import com.bridhelabz.addressBookApp.dto.*;
import com.bridhelabz.addressBookApp.entity.*;
import com.bridhelabz.addressBookApp.repository.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;
import org.modelmapper.*;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * Test class to check AddressBookService using @InjectMocks and @Mock building connection with HTTP request.
 * @author Dipali Magare
 * version 0.0.1
 * @since 16-10-2021
 */

@ExtendWith(MockitoExtension.class)
class AddressBookServiceTest {

    @InjectMocks
    private AddressBookService addressBookService;
    @Mock
    private AddressBookRepository addressBookRepository;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private AddressBuilder addressBuilder;

    @Test
    public void getPersonByID_WhenIdIsGiven() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setId(1);
        Assertions.assertEquals(1, addressBookData.getId());
    }

    @Test
    public void getPersonByName_WhenNameIsGiven() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setName("Dipali");
        Assertions.assertEquals("Dipali", addressBookData.getName());
    }

    @Test
    public void addPersonDetails_WhenDetailingIsAdded() {
        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setId(1);
        addressBookData.setName("Dips");
        addressBookData.setMobileNo("0747");
        addressBookData.setCity("Amalner");
        addressBookData.setState("MH");
        addressBookData.setEmail("dipali@gmail.com");
        Assertions.assertEquals(1, addressBookData.getId());
        assertThat(addressBookData.getName()).isEqualTo("Dips");
        assertThat(addressBookData.getMobileNo()).isEqualTo("0747");
        assertThat(addressBookData.getCity()).isEqualTo("Amalner");
        assertThat(addressBookData.getState()).isEqualTo("MH");
        assertThat(addressBookData.getEmail()).isEqualTo("dipali@gmail.com");
    }

}