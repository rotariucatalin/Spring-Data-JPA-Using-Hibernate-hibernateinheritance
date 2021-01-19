package com.example.hibernateinheritance.repositories;

import com.example.hibernateinheritance.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
