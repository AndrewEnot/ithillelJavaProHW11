package homework11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

  private final ArrayList<Record> records;

  public PhoneBook(ArrayList<Record> records) {
    this.records = records;
  }

  //this method adding Record to PhoneBook
  public void add(Record record) {
    this.records.add(record);
  }

  //this method find record with some name in PhoneBook
  public Record find(String string) {
    if (string != null) {
      for (Record record : records) {
        if (record.getName().equals(string)) {
          return record;
        }
      }
    }
    return null;
  }

  //this method find all records with same name in PhoneBook
  public List<Record> findAll(String string) {
    List<Record> recordArrayList = new ArrayList<>();
    if (string != null) {
      for (Record record : records) {
        if (record.getName().equals(string)) {
          recordArrayList.add(record);
        }
      }
    }
    return recordArrayList;
  }

  //this method prints all information about some Record
  public void print(Record record) {
    assert record != null;
    System.out.println("name: " + record.getName() + " : " + "phone: " + record.getPhone());
  }

  //this method prints all information about all Records from list of Records
  public void printPhones(List<Record> records) {
    assert records != null;
    for (Record record : records) {
      print(record);
    }
  }

  //this method prints all PhoneBook
  public void printBook() {
    for (Record record : records) {
      print(record);
    }
  }
}
