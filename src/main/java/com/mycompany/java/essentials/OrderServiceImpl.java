/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.essentials;

import com.mycompany.java.essentials.model.OrderData;
import com.mycompany.java.essentials.service.OrderService;
import com.mycompany.java.essentials.db.OrderDataHolder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author franc
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public void addOrder(int productId, int productQuantity) {
        // BUILT IN LIBS & INSTANCE CLASS
        OrderDataHolder orderHolder = new OrderDataHolder();
        Random rand = new Random();
        Date date = new Date(); 

        // AUTO GENERATE -> DETAILS
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String referenceNumber = "2022"+rand.nextInt(99999999);
        
        Double total = calculateTotal(productQuantity, 5d);
        OrderData order = new OrderData(referenceNumber, productId,formatter.format(date), productQuantity, "FOR_DELIVERY",total);
        orderHolder.addOrderToDb(order);
    }

    @Override
    public Double calculateTotal(int productQuantity, Double productPrice) {
        return productQuantity * productPrice;
    }

    @Override
    public String viewOrder() {
        OrderDataHolder orderHolder = new OrderDataHolder();
        ProductServiceImpl productService = new ProductServiceImpl();

        List<OrderData> orderList = orderHolder.getOrderList();
        
        String orders = "\nDate\tReference\tName\tPrice\tQty\tTotal\tStatus\n";
        
        if(!orderList.isEmpty()) {
            for(OrderData order: orderList) {
                orders = orders.concat(order.getDate()+
                        "\t"+order.getRefereenceNumber()+
                        "\t"+productService.getProductName(order.getProductId())+
                        "\t"+productService.getProductPrice(order.getProductId())+
                        "\t"+order.getProductQuantity()+
                        "\t"+order.getTotal()+
                        "\t"+order.getOrderStatus()+"\n");
            }
        } else {
            orders = "\nNo past orders found!";
        }
        
        return orders;
    }

}
