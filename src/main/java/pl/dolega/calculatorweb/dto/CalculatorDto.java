package pl.dolega.calculatorweb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Logger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CalculatorDto {

    private BigDecimal addition;
    private BigDecimal subtraction;
    private BigDecimal multiplication;
    private BigDecimal division;

}
