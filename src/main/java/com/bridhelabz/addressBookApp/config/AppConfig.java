package com.bridhelabz.addressBookApp.config;

import org.modelmapper.*;
import org.springframework.context.annotation.*;

/**
 * AddressBookConfig setting up ModelMapper Configuration in application
 * @author Dipali Magare
 * version 0.0.1
 * @since 16-10-2021
 */

@Configuration
public class AppConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
