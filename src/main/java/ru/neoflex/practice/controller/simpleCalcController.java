package ru.neoflex.practice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.neoflex.practice.model.simpleCalcData;
import ru.neoflex.practice.repository.simpleCalcRepository;

import javax.validation.Valid;

@RestController
public class simpleCalcController
{
    @Autowired
    private  simpleCalcRepository SimpleCalcRepository;

    @GetMapping("/allCalcHistory")
    public List<simpleCalcData> getAllCalcHistory()
    {
        return SimpleCalcRepository.findAll();
    }

}
