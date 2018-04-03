package restservices.dataconverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datetoday")
public class DataConverterController {

    private final DataConvertorService service;

    @Autowired
    public DataConverterController(DataConvertorService service){
        this.service = service;
    }

    @RequestMapping("/convert")
    public String convert(@RequestParam(value = "date") String date ){
        return service.convertDate(date);
    }
}
