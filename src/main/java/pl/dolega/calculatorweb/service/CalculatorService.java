package pl.dolega.calculatorweb.service;

import org.springframework.stereotype.Service;
import pl.dolega.calculatorweb.dto.CalculatorDto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Logger;

@Service
public class CalculatorService {

    private static final Logger LOGGER = Logger.getLogger(CalculatorDto.class.getName());

    public BigInteger addition(BigInteger a, BigInteger b) {
        LOGGER.info("performing the addition");
        return a.add(b);
    }

    public BigInteger subtraction(BigInteger a, BigInteger b) {
        LOGGER.info("performing the subtraction");

        return a.subtract(b);
    }

    public BigInteger multiplication(BigInteger a, BigInteger b) {
        LOGGER.info("performing the multiplication");
        return a.multiply(b);
    }

    public BigDecimal division(BigInteger a, BigInteger b) {
        LOGGER.info("performing the division");
        return new BigDecimal(a).divide(new BigDecimal(b));
    }
}
