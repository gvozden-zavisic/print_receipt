package model;

public class Customer {

    public String customerName;
    public String customerAddress;
    public String customerCity;
    public String customerPib;
    public String customerId;

    public Customer(String CustomerName, String CustomerAddress, String CustomerCity, String CustomerPib, String CustomerId) {
        this.customerName = CustomerName;
        this.customerAddress = CustomerAddress;
        this.customerCity = CustomerCity;
        this.customerPib = CustomerPib;
        this.customerId = CustomerId;
    }
}
