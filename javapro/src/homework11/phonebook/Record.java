package homework11.phonebook;

public class Record {

  private final String name;
  private final long phone;

  public Record(String name, long phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public long getPhone() {
    return phone;
  }
}
