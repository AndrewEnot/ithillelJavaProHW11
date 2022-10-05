package homework11.phonebook;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    PhoneBook myPhoneBook = new PhoneBook(new ArrayList<>());
    myPhoneBook.add(new Record("John Smith", 380637137744L));
    myPhoneBook.add(new Record("John Smith", 380637137748L));
    myPhoneBook.add(new Record("John Smith", 380637137750L));
    myPhoneBook.add(new Record("Peter Parker", 380934603393L));
    myPhoneBook.add(new Record("Jane Johnson", 380637138744L));
    myPhoneBook.add(new Record("Adam Sandler", 380637137844L));
    myPhoneBook.add(new Record("Michel Dupont", 380639137744L));
    myPhoneBook.add(new Record("Adam Sandler", 380637137754L));
    myPhoneBook.add(new Record("Jane Johnson", 380637337744L));

    myPhoneBook.printBook();
    System.out.println();
    myPhoneBook.print(myPhoneBook.find("John Smith"));
    System.out.println();
    myPhoneBook.printPhones(myPhoneBook.findAll("John Smith"));

  }
}
