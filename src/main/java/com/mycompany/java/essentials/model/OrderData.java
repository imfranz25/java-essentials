/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials.model;


/**
 *
 * @author franc
 */
public class OrderData {
    
    private String refereenceNumber;
    private int productId;
    private String date;
    private int productQuantity;
    private String orderStatus;
    private Double total;
    
    public OrderData(String refereenceNumber, int productId, String date, int productQuantity, String orderStatus, Double total) {
        this.refereenceNumber = refereenceNumber;
        this.productId = productId;
        this.date = date;
        this.productQuantity = productQuantity;
        this.orderStatus = orderStatus;
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getRefereenceNumber() {
        return refereenceNumber;
    }

    public void setRefereenceNumber(String refereenceNumber) {
        this.refereenceNumber = refereenceNumber;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
}
