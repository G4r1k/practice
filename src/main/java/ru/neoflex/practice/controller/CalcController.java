package ru.neoflex.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import ru.neoflex.practice.model.simpleCalcData;
import ru.neoflex.practice.repository.simpleCalcRepository;

@RestController
public class CalcController
{
    @Autowired
    private  simpleCalcRepository SimpleCalcRepository;

    @GetMapping("/plus/{a}/{b}")
    public double Plus(@PathVariable double a, @PathVariable double b)
    {
        double result = a+b;
        simpleCalcData calcData = new simpleCalcData(a,"plus",b,result);
        SimpleCalcRepository.save(calcData);
        return result;
    }

    @GetMapping("/minus/{a}/{b}")
    public double Minus(@PathVariable double a, @PathVariable double b)
    {
        double result = a-b;
        simpleCalcData calcData = new simpleCalcData(a,"minus",b,result);
        SimpleCalcRepository.save(calcData);
        return result;
    }

    @GetMapping("/multiplier/{a}/{b}")
    public double Multiplier(@PathVariable double a, @PathVariable double b)
    {
        double result = a*b;
        simpleCalcData calcData = new simpleCalcData(a,"multiplier",b,result);
        SimpleCalcRepository.save(calcData);
        return result;
    }

    @GetMapping("/division/{a}/{b}")
    public double Division(@PathVariable double a, @PathVariable double b)
    {
        double result = a/b;
        simpleCalcData calcData = new simpleCalcData(a,"division",b,result);
        SimpleCalcRepository.save(calcData);
        return result;
    }
}
