package com.tenpochallenge.dto;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Validated
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorRequestDto {
    private long number1;
    private long number2;

    public Long getNumber1() {
        return this.number1;
    }
    
    public Long getNumber2() {
        return this.number2;
    }
    
}
