package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtility {
    
      public static String now(){
      LocalDate date = LocalDate.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY.");
      return formatter.format(date);  
   }
}

    

