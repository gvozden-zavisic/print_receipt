package utilities;

import java.io.File;
import javax.swing.JOptionPane;

public class FileUtility {

    public static String separator = System.getProperty("file.separator");
    public static File firmPath = new File(System.getProperty("user.home") + separator + "reciptStamp");

    public static void createMainFolder() {
        if (!firmPath.exists()) {
            firmPath.mkdir();
            JOptionPane.showMessageDialog(null,
                    "Napravljen je direktorijum aplikacije.");
        }
    }



    public static File createReciptFolder() {
        File reciptPath = new File(
                FileUtility.firmPath + separator + "rcpts" + separator);
        
        if (!reciptPath.exists()) {
            reciptPath.mkdir();
            JOptionPane.showMessageDialog(null,
                    "Napravljen je direktorijum\n za \u010duvanje ra\u010duna.");
        }
        return reciptPath;
    }

    public static File createCompaniesFolder() {
        File companiesPath = new File(FileUtility.firmPath + separator + "companies" + separator);
        if (!companiesPath.exists()) {
            companiesPath.mkdir();
            JOptionPane.showMessageDialog(null,
                    "Napravljen je direktorijum\n za \u010duvanje kompanija.");
        }
        return companiesPath;
    }

}
