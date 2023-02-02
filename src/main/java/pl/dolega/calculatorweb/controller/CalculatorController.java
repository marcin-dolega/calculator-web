package pl.dolega.calculatorweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dolega.calculatorweb.service.CalculatorService;

import java.math.BigDecimal;
import java.math.BigInteger;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public BigInteger add() {
        return calculatorService.addition(BigInteger.valueOf(3), BigInteger.valueOf(2));
    }

    @GetMapping("/sub")
    public BigInteger sub() {
        return calculatorService.subtraction(BigInteger.valueOf(3), BigInteger.valueOf(2));
    }

    @GetMapping("/mul")
    public BigInteger mul() {
        return calculatorService.multiplication(BigInteger.valueOf(3), BigInteger.valueOf(2));
    }

    @GetMapping("/div")
    public BigDecimal div() {
        return calculatorService.division(BigInteger.valueOf(3), BigInteger.valueOf(2));
    }
}
