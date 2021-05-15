package Session6.OOPExample;

public class Laptop {
  private int price;

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) throws Exception {
    if (price >= 0)
      this.price = price;
    else
      throw new Exception("Price >= 0");
  }
}
