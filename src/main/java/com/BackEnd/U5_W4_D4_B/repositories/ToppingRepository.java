package com.BackEnd.U5_W4_D4_B.repositories;

import com.BackEnd.U5_W4_D4_B.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository extends JpaRepository<Topping,Long> {
}
