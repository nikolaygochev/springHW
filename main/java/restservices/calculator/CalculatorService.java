package restservices.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private double a;
    private double b;

    public double addNumbers(double a, double b) {
        return a + b;
    }

    public double subtractNumbers(double a, double b) {
        return a - b;
    }

    public double multiplyNumbers(double a, double b) {
        return a * b;
    }

    public double divideNumbers(double a, double b) {
        return a / b;
    }

}
