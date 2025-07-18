package com.BackEnd.U5_W4_D4_B.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Toppings")
@Getter
@Setter
@NoArgsConstructor
public class Topping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double price;

    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizzas = new ArrayList<>();

    public Topping(String name, double price, List<Pizza> pizzas) {
        this.name = name;
        this.price = price;
        this.pizzas = pizzas;
    }
}
