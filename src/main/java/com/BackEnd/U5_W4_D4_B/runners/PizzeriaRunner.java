package com.BackEnd.U5_W4_D4_B.runners;

import com.BackEnd.U5_W4_D4_B.entities.Pizza;
import com.BackEnd.U5_W4_D4_B.repositories.PizzaRepository;
import com.BackEnd.U5_W4_D4_B.services.PizzeriaService;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PizzeriaRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        Faker faker = new Faker();

        List<Pizza> newPizzas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Pizza newPizza = new Pizza(faker.food().dish(), faker.lorem().paragraph(), faker.number().randomDouble(2, 10, 100));
            newPizzas.add(newPizza);
        }
        PizzeriaService.saveMany(newPizzas);

    }
}
