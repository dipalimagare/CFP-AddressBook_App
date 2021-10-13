package com.bridhelabz.addressBookApp.controller;

import com.bridhelabz.addressBookApp.dto.*;
import com.bridhelabz.addressBookApp.service.*;
import com.google.common.collect.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import org.mockito.junit.jupiter.*;
import org.springframework.http.*;

import java.util.*;

import static org.mockito.Mockito.when;

/**
 * Test class to check AddressBookAppController using @InjectMocks and @Mock building connection with HTTP request.
 * @author Dipali Magare
 * version 0.0.1
 * @since 16-10-2021
 */

@ExtendWith(MockitoExtension.class)
class AddressBookAppControllerTest {

    @InjectMocks
    private AddressBookController addressBookAppController;

    @Mock
    private IAddressBookService iAddressBookService;

    @Test
    public void getAddressTest() {
        when(iAddressBookService.getAddresses()).thenReturn(Lists.newArrayList(new AddressBookDTO()));
        IAddressBookService addressBookController;
        ResponseEntity<List<AddressBookDTO>> responseEntity = null;
        Assertions.assertNull(responseEntity);
        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals(1, responseEntity.getBody().size());
    }
}