package house;

public class PrivateHouse extends House{

  public PrivateHouse(String address) {
    super(address);
  }

  @Override
  public String getAddress() {
    return super.getAddress();
  }

  @Override
  public void setAddress(String address) {
    super.setAddress(address);
  }

  @Override
  public String toString() {
    return "Адрес частного дома: " + getAddress();
  }

  @Override
  public void demolishHouse() {
    System.out.println("Вы снесли частный дом");
  }
}
