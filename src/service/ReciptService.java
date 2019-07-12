package service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Article;
import model.Company;
import model.Recipt;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import utilities.DateUtility;
import utilities.FileUtility;

public class ReciptService {

    public static void saveRecipt(Recipt recipt) throws IOException {
                System.out.println(recipt.reciptNo);

        JSONObject reciptj = new JSONObject();
        JSONObject articlesList = new JSONObject();
        reciptj.put("reciptNo", recipt.reciptNo);
        reciptj.put("customer", recipt.customer);
        reciptj.put("custAddress", recipt.custAddress);
        reciptj.put("custCity", recipt.custCity);
        reciptj.put("custPIB", recipt.custPIB);
        reciptj.put("custId", recipt.custId);
        reciptj.put("reciptCity", recipt.reciptCity);
        reciptj.put("dateOfSell", recipt.dateOfSell);
        reciptj.put("dateValute", recipt.dateValute);
        
        
        articlesList.put("length", recipt.articles.size());
        for (int i = 0; i < recipt.articles.size(); i++) {
            articlesList.put("ean" + String.valueOf(i),
                    recipt.articles.get(i).ean);
            articlesList.put("name" + String.valueOf(i),
                    recipt.articles.get(i).name);
            articlesList.put("unit" + String.valueOf(i),
                    recipt.articles.get(i).unit);
            articlesList.put("qty" + String.valueOf(i),
                    recipt.articles.get(i).qty);
            articlesList.put("price" + String.valueOf(i),
                    recipt.articles.get(i).priceWithTaxPerPiece);
            articlesList.put("tax" + String.valueOf(i),
                    recipt.articles.get(i).tax);
        }
        File reciptPath = FileUtility.createReciptFolder();
        String fileDate = DateUtility.now().
                replace(".", "-");
        try (final FileWriter fileWr = new FileWriter(reciptPath + FileUtility.separator + "R-" + recipt.reciptNo + "-" + fileDate + "S.json")) {
            fileWr.write(reciptj.toString());
        }
        try (final FileWriter fileWr2 = new FileWriter(reciptPath + FileUtility.separator + "A-" + recipt.reciptNo + "-" + fileDate + "S.json")) {
            fileWr2.write(articlesList.toString());
        }
    }

    public static Recipt getRecipt(File fpath) throws IOException {
        JSONParser parser = new JSONParser();
        JSONParser parserl = new JSONParser();
        JSONObject parsed = null;
        JSONObject parsedl = null;
        File f = fpath;
        String fpath2 = fpath.getAbsolutePath().
                replace("R",
                "A");
        File f2 = new File(fpath2);
        try {
            parsedl = (JSONObject) parser.parse(new FileReader(f2));
        } catch (ParseException ex) {
            Logger.getLogger(Company.class.getName()).
                    log(Level.SEVERE,
                    null,
                    ex);
        }
        String loadLength = parsedl.get("length").
                toString();
        int lngt = Integer.parseInt(loadLength);
        List<Article> loadArticles = new ArrayList<>();
        for (int k = 0; k < lngt; k++) {
            int getEan = Integer.parseInt(parsedl.get("ean" + String.valueOf(k)).
                    toString());
            String getName = parsedl.get("name" + String.valueOf(k)).
                    toString();
            String getUnit = parsedl.get("unit" + String.valueOf(k)).
                    toString();
            int getQty = Integer.parseInt(parsedl.get("qty" + String.valueOf(k)).
                    toString());
            double getPrice = Double.parseDouble(parsedl.get("price" + String.valueOf(k)).
                    toString());
            int getTax = Integer.parseInt(parsedl.get("tax" + String.valueOf(k)).
                    toString());
            Article a = new Article(getEan, getName, getUnit, getQty, getPrice, getTax);
                   
            loadArticles.add(a);
        }
        try {
            parsed = (JSONObject) parser.parse(new FileReader(f));
        } catch (ParseException ex) {
            Logger.getLogger(Company.class.getName()).
                    log(Level.SEVERE,
                    null,
                    ex);
        }
        String loadReciptNo = parsed.get("reciptNo").
                toString();
        String loadCustomer = parsed.get("customer").
                toString();
        String loadCustAddress = parsed.get("custAddress").
                toString();
        String loadCity = parsed.get("custCity").
                toString();
        String loadPIB = parsed.get("custPIB").
                toString();
        String loadID = parsed.get("custId").
                toString();
        String loadReciptCity = parsed.get("reciptCity").
                toString();
        String loadSell = parsed.get("dateOfSell").
                toString();
        String loadValute = parsed.get("dateValute").
                toString();
        Recipt rd = new Recipt(loadReciptNo,
                loadCustomer,
                loadCustAddress,
                loadCity,
                loadPIB,
                loadID,
                loadReciptCity,
                loadSell,
                loadValute,
                loadArticles);
        return rd;
    }
    
    
    
}
