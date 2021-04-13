package Assignment6.utils;

public class SQLCommand {
  public static String BILL_QUERY_FIND_ALL = "SELECT *, SUM(total_price) AS total_price FROM Bill";

  public static String BILL_QUERY_ADD = "{CALL usp_AddBill(?, ?, ?, ?, ?)}";
  public static String BILL_QUERY_DELETE = "{CALL usp_DeleteBill(?, ?)}";
  public static String BILL_QUERY_FIND_BY_CODE = "SELECT *, SUM(total_price) AS total_price FROM Bill Where bill_code=?";
  public static String BILL_QUERY_FIND_BY_CUSTOMER_NAME = "SELECT *, SUM(total_price) AS total_price FROM Bill Where customer_name=?";
  public static String ITEM_QUERY_FIND_ALL = "SELECT * FROM dbo.udf_FindItemByBillCode(?)";
  public static String ITEM_QUERY_ADD = "INSERT INTO Item(product_name, bill_code, quantity, price) VALUE (?, ?, ?, ?)";
  public static String ITEM_QUERY_DELETE = "DELETE FROM Item WHERE bill_code=? AND product_name=?";
  public static String ITEM_QUERY_FIND_CODE_AND_PRODUCT_NAME = "SELECT * FROM Item WHERE bill_code=? AND product_name=?";
}
