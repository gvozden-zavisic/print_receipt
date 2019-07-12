package service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Company;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import utilities.FileUtility;

public class CompanyService {

    public static void saveCompany(Company company) throws IOException {
        JSONObject firm = new JSONObject();
        firm.put("name",
                company.name);
        firm.put("address",
                company.address);
        firm.put("city",
                company.city);
        firm.put("pib",
                company.pib);
        firm.put("accountNo",
                company.accountNo);
        firm.put("tel",
                company.phone);
        firm.put("taxRate",
                company.taxRate);
        firm.put("jmSet",
                company.unitSet);
        try (final FileWriter fileWr = new FileWriter(FileUtility.firmPath + FileUtility.separator + "firmDetails.json")) {
            fileWr.write(firm.toString());
        }
    }

    public static Company getCompany() throws IOException {
        JSONParser parser = new JSONParser();
        JSONObject parsed = null;
        File f = new File(FileUtility.firmPath,
                FileUtility.separator + "firmDetails.json");
        try {
            parsed = (JSONObject) parser.parse(new FileReader(f));
        } catch (ParseException ex) {
            Logger.getLogger(Company.class.getName()).
                    log(Level.SEVERE,
                    null,
                    ex);
        }
        String loadName = parsed.get("name").
                toString();
        String loadAddress = parsed.get("address").
                toString();
        String loadCity = parsed.get("city").
                toString();
        String loadPib = parsed.get("pib").
                toString();
        String loadAcc = parsed.get("accountNo").
                toString();
        String loadTel = parsed.get("tel").
                toString();
        String loadTax = parsed.get("taxRate").
                toString();
        String loadJm = parsed.get("jmSet").
                toString();
        Company fd = new Company(loadName,
                loadAddress,
                loadCity,
                loadPib,
                loadAcc,
                loadTel,
                loadTax,
                loadJm);
        return fd;
    }
    
    
}
