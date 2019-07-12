package model;

import java.util.List;

public class Recipt {

   public String reciptNo;
   public String customer;
   public String custAddress;
   public String custCity;
   public String custPIB;
   public String custId;
   public String reciptCity;
   public String dateOfSell;
   public String dateValute;
   public List<Article> articles;

    public Recipt(String reciptNo, String customer, String custAddress, String custCity, String custPIB, String custId, String reciptCity, String dateOfSell, String dateValute, List<Article> articles) {
        this.reciptNo = reciptNo;
        this.customer = customer;
        this.custAddress = custAddress;
        this.custCity = custCity;
        this.custPIB = custPIB;
        this.custId = custId;
        this.reciptCity = reciptCity;
        this.dateOfSell = dateOfSell;
        this.dateValute = dateValute;
        this.articles = articles;
    }
}
