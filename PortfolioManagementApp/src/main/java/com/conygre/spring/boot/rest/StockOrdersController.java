package com.conygre.spring.boot.rest;

import com.conygre.spring.boot.entities.StockOrder;
import com.conygre.spring.boot.services.StockOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stockorders")
@CrossOrigin // allows requests from all domains
public class StockOrdersController {
    @Autowired
    private StockOrdersService service;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<StockOrder> findAll() {
        return service.getAllOrders();
    }
}
