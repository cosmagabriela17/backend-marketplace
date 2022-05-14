package com.marketplace.easybox.controller;

import com.marketplace.easybox.entities.Clients;
import com.marketplace.easybox.entities.Orders;
import com.marketplace.easybox.entities.OutputOrder;
import com.marketplace.easybox.repository.ClientsRepository;
import com.marketplace.easybox.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
@CrossOrigin
public class Controller {

    @Autowired
    private ClientsRepository clientsRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    @GetMapping(path="/clients")
    public @ResponseBody Iterable<Clients> getAllClients() {
        return clientsRepository.findAll();
    }


    @GetMapping(path="/orders")
    public @ResponseBody Iterable<Orders> gertAllOrders() {
        return ordersRepository.findAll();
    }

    @GetMapping(path="/orders/{id}")
    public @ResponseBody List<OutputOrder> getClientOrder(@PathVariable("id") int id) {
        Iterable<Orders> orders = ordersRepository.findAll();
        List<OutputOrder> ordersList = new ArrayList<>();
        for(Orders order : orders) {
            if(order.getClient().getClient_id() == id ) {
                ordersList.add(new OutputOrder(order.getOrderId(), order.getOrderValue(),order.getNumberOfProducts(),
                        order.getLocationName(), order.getLatitude(), order.getLongitude()));
            }
        }
        return ordersList;
    }

}
