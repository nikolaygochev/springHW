package restservices.translator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/translate")
public class TranslatorController {

private final TranslatorService service;

@Autowired
public TranslatorController(TranslatorService service){
    this.service = service;
}

@RequestMapping("")
public String translator(@RequestParam(value = "langFrom") String langFrom,
                         @RequestParam(value = "langTo") String langTo,
                         @RequestParam(value = "word") String word) throws Exception {

return service.translate(langFrom,langTo,word);
}

}
