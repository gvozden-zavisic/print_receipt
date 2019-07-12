package service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Company;
import model.Customer;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import utilities.FileUtility;

public class CustormerService {

    public static void saveCustomer(Customer customer) throws IOException {
        JSONObject company = new JSONObject();
        company.put("name",
                customer.customerName);
        company.put("address",
                customer.customerAddress);
        company.put("city",
                customer.customerCity);
        company.put("pib",
                customer.customerPib);
        company.put("id",
                customer.customerId);
        File f = new File(FileUtility.createCompaniesFolder(),
                customer.customerName + ".json");
        if (!f.exists() && !f.isDirectory()) {
            try (final FileWriter fileWriter = new FileWriter(FileUtility.firmPath + FileUtility.separator + "companies" + FileUtility.separator + customer.customerName + ".json")) {
                fileWriter.write(company.toString());
                JOptionPane.showMessageDialog(null,
                        "Kupac sa\u010duvan!");
                return;
            }
        } else {
            int result = JOptionPane.showConfirmDialog(null,
                    "Fajl postoji. Prepisati?",
                    "UPOZORENJE",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                try (final FileWriter fileCoWr = new FileWriter(FileUtility.firmPath + FileUtility.separator + "companies" + FileUtility.separator + customer.customerName + ".json")) {
                    fileCoWr.write(company.toString());
                    JOptionPane.showMessageDialog(null,
                            "Kupac sa\u010duvan!");
                }
            }
        }
    }

    public static Customer getCustomer(File f) throws IOException {
        JSONParser parser = new JSONParser();
        JSONObject parsed = null;
        try {
            parsed = (JSONObject) parser.parse(new FileReader(f));
        } catch (ParseException ex) {
            Logger.getLogger(Company.class.getName()).
                    log(Level.SEVERE,
                    null,
                    ex);
        }
        String loadCustomer = parsed.get("name").
                toString();
        String loadAddress = parsed.get("address").
                toString();
        String loadCity = parsed.get("city").
                toString();
        String loadPib = parsed.get("pib").
                toString();
        String loadId = parsed.get("id").
                toString();
        Customer cd = new Customer(loadCustomer,
                loadAddress,
                loadCity,
                loadPib,
                loadId);
        return cd;
    }
    
    
    
}
