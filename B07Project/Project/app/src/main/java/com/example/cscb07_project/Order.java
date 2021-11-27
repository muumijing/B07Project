package com.example.cscb07_project;

import java.util.List;

public class Order {

    public List<Product> orderProducts;
    //Pending; Processing; Wait for pick up; Complete; Cancelled; SentOut
    public String status;
    public String orderId;

    //store the information that which customer order products from which store
    public String store;
    public String customer;
}
