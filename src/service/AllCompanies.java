package service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Customer;
import utilities.FileUtility;

public class AllCompanies {

    public static List<Customer> allCompanies = new ArrayList<>();

    public static List getCompanies() {
        if(!allCompanies.isEmpty()){
        allCompanies.removeAll(allCompanies);}
        File f = FileUtility.createCompaniesFolder();
        
        ArrayList<String> names = new ArrayList<>(Arrays.asList(f.list()));
        names.stream().map((name) -> new File(f + FileUtility.separator + name)).forEachOrdered((l) -> {
            try {
                Customer loadc = CustormerService.getCustomer(l);
                allCompanies.add(loadc);
            } catch (IOException ex) {
                Logger.getLogger(AllCompanies.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        return allCompanies;
    }

    public static void deleteCompany(String company) {

        File c = new File(FileUtility.firmPath + FileUtility.separator + "companies" + FileUtility.separator + company + ".json");
        c.delete();
        allCompanies = (ArrayList) AllCompanies.getCompanies();
        JOptionPane.showMessageDialog(null, "Kupac " + company + " je obrisan.");
    }

}
