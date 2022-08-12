package com.conygre.spring.boot.services;

import com.conygre.spring.boot.entities.StockOrder;
import com.conygre.spring.boot.repos.StockOrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StockOrdersServiceImpl implements StockOrdersService {
    @Autowired
    private StockOrdersRepository dao;

    @Transactional(propagation = Propagation.REQUIRED)
    public Iterable<StockOrder> getAllOrders() {
        return dao.findAll();
    }

    @Override
    public void addNewStockOrder(StockOrder stockOrder) {

    }

    @Override
    public void deleteStockOrder(int id) {

    }

    @Override
    public void deleteAllStockOrders() {

    }

    @Override
    public StockOrder getStockOrderBySymbol(String stockSymbol) {
        return null;
    }

    @Override
    public void updateStockOrder(StockOrder stockOrder) {

    }
}
