package model;

public class Company {

    public String name;
    public String address;
    public String city;
    public String pib;
    public String accountNo;
    public String phone; 
    public String taxRate;
    public String unitSet;
     
    public Company(String name, String address, String city, String pib, String accountNo, String tel, String taxRate, String jmSet) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.pib = pib;
        this.accountNo = accountNo;
        this.phone = tel;
        this.taxRate = taxRate;
        this.unitSet = jmSet;
    }
    

     
     

}
