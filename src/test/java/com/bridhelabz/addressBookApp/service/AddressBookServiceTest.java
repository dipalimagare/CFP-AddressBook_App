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
    public void getAddressTest() {
        ArrayList<AddressBookData> addressBookDOList = new ArrayList<>();
        AddressBookData addressBookDO1 = new AddressBookData();
        addressBookDO1.setId(1);
        addressBookDO1.setName("Sanobar");
        AddressBookData addressBookDO2 = new AddressBookData();
        addressBookDO2.setId(2);
        addressBookDO2.setName("Divya");
        addressBookDOList.add(addressBookDO1);
        addressBookDOList.add(addressBookDO2);

        AddressBookDTO addressBookDTO = new AddressBookDTO();
        addressBookDTO.setId(1);
        addressBookDTO.setName("Sanobar");
        AddressBookDTO addressBookDTO2 = new AddressBookDTO();
        addressBookDTO2.setId(2);
        addressBookDTO2.setName("Divya");

        when(addressBookRepository.findAll()).thenReturn(addressBookDOList);
        when(modelMapper.map(((ArrayList<?>) addressBookDOList).get(0), AddressBookDTO.class)).thenReturn(
                addressBookDTO);
        when(modelMapper.map(((ArrayList<?>) addressBookDOList).get(1), AddressBookDTO.class)).thenReturn(
                addressBookDTO2);

        List<AddressBookDTO> actualAddressesList = addressBookService.getAddresses();

        assertNull(actualAddressesList);
        for (int i = 0; i < ((ArrayList<?>) addressBookDOList).size(); i++) {
            assertEquals(i + 1, actualAddressesList.get(i).getId());
        }
        assertEquals("Sanobar", actualAddressesList.get(0).getName());
        assertEquals("Divya", actualAddressesList.get(1).getName());
    }

    @Test
    public void addAddressBookTest() {
        AddressBookDTO addressBookDTO = new AddressBookDTO();
        addressBookDTO.setName("Dipali");
        addressBookDTO.setAddress("MH");

        AddressBookData addressBookData = new AddressBookData();
        addressBookData.setName("Dipali");
        addressBookData.setAddress("MH");
        addressBookData.setId(1);
        when(addressBuilder.buildDO(addressBookDTO)).thenReturn(addressBookData);
        when(addressBookRepository.save(addressBookData)).thenReturn(addressBookData);

        AddressBookDTO actualAddressBookDTO = addressBookService.addAddressBook(addressBookDTO);
        assertNotNull(actualAddressBookDTO);
        assertEquals(1, actualAddressBookDTO.getId());
    }

}