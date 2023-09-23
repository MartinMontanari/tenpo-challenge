package com.tenpochallenge.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tenpochallenge.dto.CalculatorRequestDto;

@Service
public class CalculatorService {
    @Autowired
    private PercentageService percentageService;

    public Long calculate(CalculatorRequestDto calculatorRequestDto){
        long result = 0;
        long number1 = calculatorRequestDto.getNumber1();
        long number2 = calculatorRequestDto.getNumber2();
        int percentageToApply = this.percentageService.getPercentageToApply();
        result = (number1 + number2) + ((percentageToApply/100)* percentageToApply);
        return result;
    }
    
}
