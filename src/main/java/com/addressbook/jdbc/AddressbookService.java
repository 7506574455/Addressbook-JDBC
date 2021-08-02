package com.addressbook.jdbc;

import java.util.*;
import com.addressbook.jdbc.Person;

public class AddressbookService {
	
    public enum IOService {DB_IO, REST_IO}
    private List<Person> personList;
    private AddressBookDBService addressBookDBService;

    //constructor
    public AddressbookService() {
        addressBookDBService = AddressBookDBService.getInstance();
    }
    
    public AddressbookService(List<Person> personList) {
        this();
        this.personList = personList;
    }
    
    
     //checking address book of data equal 
     
    public List<Person> readAddressBookData(IOService ioService) {
        if (ioService.equals(IOService.DB_IO))
            this.personList = addressBookDBService.readData();
        return personList;
    }
}
