package com.addressbook.jdbc;

import com.addressbook.jdbc.AddressbookService;
import com.addressbook.jdbc.Person;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

public class AddressBookServiceTest {
    @Before
    public void init() {
        System.out.println("Welcome to AddressBook Service Program");
    }

    @Test
    public void givenAddressBookDB_WhenRetrivedShouldMatchPersonCount() {
        AddressbookService addressbookService = new AddressbookService();
        List<Person> addressBookData = addressbookService.readAddressBookData(AddressbookService.IOService.DB_IO);
        Assert.assertEquals(2, addressBookData.size());
    }
}
