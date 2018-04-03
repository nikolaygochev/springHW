package restservices.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {

    private final CalculatorService service;

    @Autowired
    public CalculatorController(CalculatorService service){
        this.service = service;
    }

    @RequestMapping("/add")
    public double add(@RequestParam(value = "a") double a,
                      @RequestParam(value = "b") double b){
        return service.addNumbers(a, b);
    }

    @RequestMapping("/subtract")
    public double subtract(@RequestParam(value = "a") double a,
                           @RequestParam(value = "b") double b){
        return service.subtractNumbers(a, b);
    }

    @RequestMapping("/multiply")
    public double multiply(@RequestParam(value = "a") double a,
                           @RequestParam(value = "b") double b){
        return service.multiplyNumbers(a, b);
    }

    @RequestMapping("/divide")
    public double divide(@RequestParam(value = "a") double a,
                         @RequestParam(value = "b") double b){
        return service.divideNumbers(a, b);
    }

}
