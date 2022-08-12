package com.conygre.spring.boot.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="stock_orders")

public class StockOrder implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="order_id")
    private int orderID;

    @Column(name="order_status") private String orderStatus;
    @Column(name="num_of_shares") private Integer numOfShares;
    @Column(name="stock_symbol") private String stockSymbol;
    @Column(name="user_email") private String userEmail;

    public StockOrder(){}

    public StockOrder(int orderID, String orderStatus, Integer numOfShares, String stockSymbol, String userEmail) {
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.numOfShares = numOfShares;
        this.stockSymbol = stockSymbol;
        this.userEmail = userEmail;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(Integer numOfShares) {
        this.numOfShares = numOfShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
