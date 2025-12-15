package com.contacts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactManager {

    private List<Contact> contacts = new ArrayList<>();


    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    
    public boolean deleteContactById(int contactId) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getId() == contactId) {
                it.remove();
                return true;
            }
        }
        return false;
    }

  
    public boolean updatePhoneNumber(int contactId, String newPhoneNumber) {
        for (Contact c : contacts) {
            if (c.getId() == contactId) {
                c.setPhoneNumber(newPhoneNumber);
                return true;
            }
        }
        return false;
    }

 
    public List<Contact> searchContactsByName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                result.add(c);
            }
        }
        return result;
    }

    
    public List<Contact> getAllContacts() {
        return contacts;
    }
}
