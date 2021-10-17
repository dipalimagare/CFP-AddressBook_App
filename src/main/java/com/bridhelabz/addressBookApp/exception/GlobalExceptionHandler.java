package com.bridhelabz.addressBookApp.exception;

import com.bridhelabz.addressBookApp.dto.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
/**
 * Address Book exception handler handles exception and shows HTTP Bad Requests or display if Internal servererror occurs.
 *
 * @author Dipali Magare
 * @version 0.0.1
 * @since 16-10-2021
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDTO> globalExceptionHandler(Exception ex) {
        return new ResponseEntity<>(new ResponseDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage(), null),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ResponseDTO> customExceptionHandler(Exception ex) {
        return new ResponseEntity<>(new ResponseDTO(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), null),
                HttpStatus.BAD_REQUEST);
    }
}