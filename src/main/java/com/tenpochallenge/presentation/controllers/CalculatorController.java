package com.tenpochallenge.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tenpochallenge.application.services.CalculatorService;
import com.tenpochallenge.dto.CalculatorRequestDto;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
    
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/calculate")
    public Long makeCalculation(@RequestBody CalculatorRequestDto calculatorRequestDto){
        Long calculationResult = this.calculatorService.calculate(calculatorRequestDto);
        return calculationResult;
    }
}
