package restservices.dataconverter;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class DataConvertorService {

    public String convertDate(String date){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/yyyy");
        String dayOfWeek = LocalDate.parse(date, format).getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, Locale.US);
        return dayOfWeek;
    }

}
