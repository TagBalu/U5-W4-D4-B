package com.BackEnd.U5_W4_D4_B.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pizzas")
@Getter
@Setter
@NoArgsConstructor
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private double price;

    @ManyToMany
    @JoinTable(
            name = "pizza_topping",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> toppings;


    public Pizza(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void addTopping(Topping topping) {
        if (toppings == null) {
            toppings = new ArrayList<>();
        }
        toppings.add(topping);
        topping.getPizzas().add(this);
    }

    public void removeTopping(Topping topping) {
        if (toppings != null) {
            toppings.remove(topping);
            topping.getPizzas().remove(this);
        }
    }

}
