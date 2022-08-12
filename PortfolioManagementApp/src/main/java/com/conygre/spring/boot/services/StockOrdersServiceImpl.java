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
    public StockOrder addNewStockOrder(StockOrder stockOrder) {
        stockOrder.setOrderID(0);
        return dao.save(stockOrder);
    }

    @Override
    public void deleteStockOrder(int id) {
        StockOrder toBeDeleted = dao.findById(id).get();
        dao.delete(toBeDeleted);
    }

    @Override
    public void deleteAllStockOrders() {
        dao.deleteAll();
    }

    @Override
    public StockOrder getStockOrderBySymbol(String stockSymbol) {
        return null;
    }

    @Override
    public void updateStockOrder(StockOrder stockOrder) {

    }
}
