package com.BackEnd.U5_W4_D4_B.services;

import com.BackEnd.U5_W4_D4_B.entities.Pizza;
import com.BackEnd.U5_W4_D4_B.exceptions.ValidationException;
import com.BackEnd.U5_W4_D4_B.repositories.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PizzeriaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public void savePizza (Pizza newPizza){

        pizzaRepository.save(newPizza);
    }

    public void saveMany(List<Pizza> newPizzas){
        for ( Pizza pizza : newPizzas){
            try {
                this.savePizza(pizza);
            }catch (ValidationException ex){
                log.error(ex.getMessage());
            }
        }
    }
}
