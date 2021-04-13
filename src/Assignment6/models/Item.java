package Assignment6.models;

import java.io.Serializable;

public class Item implements Serializable {
  private static final long serialVersionUID = 1L;

  private String productName;
  private String billCode;
  private int quantity;
  private double price;

  public Item() {
    super();
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getBillCode() {
    return billCode;
  }

  public void setBillCode(String billCode) {
    this.billCode = billCode;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Item(String productName, String billCode, int quantity, double price) {
    super();
    this.setProductName(productName);
    this.setBillCode(billCode);
    this.setQuantity(quantity);
    this.setPrice(price);
  }

}
