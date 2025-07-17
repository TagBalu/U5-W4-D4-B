package com.BackEnd.U5_W4_D4_B.services;

import com.BackEnd.U5_W4_D4_B.entities.Pizza;
import com.BackEnd.U5_W4_D4_B.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzeriaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public void savePizza (Pizza newPizza){

    }
}
