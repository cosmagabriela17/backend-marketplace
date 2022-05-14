package com.marketplace.easybox.repository;


import com.marketplace.easybox.entities.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {
}
