package com.contacts;

public class contactsop {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        manager.addContact(new Contact(1, "Alice", "12345", "alice@mail.com"));
        manager.addContact(new Contact(2, "Bob", "67890", "bob@mail.com"));
    

        System.out.println(manager.getAllContacts());

        manager.updatePhoneNumber(1, "99999");
        System.out.println(manager.getAllContacts());
        manager.deleteContactById(2);
        System.out.println(manager.getAllContacts());

        System.out.println(manager.searchContactsByName("Alice"));
    }
    
}
