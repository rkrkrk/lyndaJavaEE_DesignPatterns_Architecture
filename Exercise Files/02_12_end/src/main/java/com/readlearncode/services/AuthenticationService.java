package com.readlearncode.services;

import com.readlearncode.Customer;
import com.readlearncode.CustomerEvent;

import javax.annotation.Priority;
import javax.enterprise.event.ObservesAsync;

import static com.readlearncode.CustomerEvent.Type.ADD;
import static com.readlearncode.CustomerEvent.Type.REMOVE;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AuthenticationService {

    public void createAuthenticationCredentials(@ObservesAsync @Priority(100) @CustomerEvent(ADD) Customer customer){
        // create authentication credentials
    }

    public void deleteAuthenticationCredentials(@ObservesAsync @CustomerEvent(REMOVE) Customer customer) {
        // delete authentication credentials
    }
}